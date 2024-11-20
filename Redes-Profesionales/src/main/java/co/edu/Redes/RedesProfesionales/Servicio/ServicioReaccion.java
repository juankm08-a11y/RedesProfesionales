package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Reaccion;
import co.edu.Redes.RedesProfesionales.Repositorio.ReaccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioReaccion {

    @Autowired
    private ReaccionRepositorio repositorioReaccion;

    public Reaccion crearReaccion(Reaccion reaccion) {
        return repositorioReaccion.save(reaccion);
    }

    public List<Reaccion> obtenerReaccionesPorPublicacion(String idPublicacion) {
        return repositorioReaccion.findByPublicacionId(idPublicacion);
    }

    public void eliminarReaccion(String idReaccion) {
        repositorioReaccion.deleteById(idReaccion);
    }

	public Reaccion crearReaccion(String usuarioId, String tipoReaccion, String contenidoPublicacion,
			String fechaPublicacion) {
		return null;
	}
}
