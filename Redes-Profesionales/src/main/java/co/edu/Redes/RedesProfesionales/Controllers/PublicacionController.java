package co.edu.Redes.RedesProfesionales.Controllers;

import co.edu.Redes.RedesProfesionales.modelo.Comentario;
import co.edu.Redes.RedesProfesionales.modelo.Reaccion;
import co.edu.Redes.RedesProfesionales.Servicio.ServicioReaccion;
import co.edu.Redes.RedesProfesionales.Servicio.ServicioComentario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/publicaciones")
public class PublicacionController{

    @Autowired
    private ServicioComentario servicioComentario;

    @Autowired
    private ServicioReaccion servicioReaccion;

    @PostMapping("/comentario")
    public Comentario crearComentario(@RequestParam String usuarioId, @RequestParam String contenidoComentario,
                                      @RequestParam String contenidoPublicacion, @RequestParam String fechaPublicacion) {
        return servicioComentario.crearComentario(usuarioId, contenidoComentario, contenidoPublicacion, fechaPublicacion);
    }

    @PostMapping("/reaccion")
    public Reaccion crearReaccion(@RequestParam String usuarioId, @RequestParam String tipoReaccion,
                                  @RequestParam String contenidoPublicacion, @RequestParam String fechaPublicacion) {
        return servicioReaccion.crearReaccion(usuarioId, tipoReaccion, contenidoPublicacion, fechaPublicacion);
    }
}
