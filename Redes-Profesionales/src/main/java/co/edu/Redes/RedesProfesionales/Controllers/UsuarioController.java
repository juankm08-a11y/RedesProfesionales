package co.edu.Redes.RedesProfesionales.Controllers;

import co.edu.Redes.RedesProfesionales.Servicio.ServicioUsuario;

import co.edu.Redes.RedesProfesionales.modelo.Usuario;
import co.edu.Redes.RedesProfesionales.modelo.UsuarioGratuito;
import co.edu.Redes.RedesProfesionales.modelo.UsuarioPremium;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private ServicioUsuario usuarioServicio;

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioServicio.crearUsuario(usuario);
    }

    @GetMapping("/todos")
    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioServicio.obtenerTodosLosUsuarios();
    }

    @PostMapping("/gratuito/crear")
    public UsuarioGratuito crearUsuarioGratuito(@RequestBody UsuarioGratuito usuarioGratuito) {
        return usuarioServicio.crearUsuarioGratuito(usuarioGratuito);
    }

    @PostMapping("/premium/crear")
    public UsuarioPremium crearUsuarioPremium(@RequestBody UsuarioPremium usuarioPremium) {
        return usuarioServicio.crearUsuarioPremium(usuarioPremium);
    }
}
