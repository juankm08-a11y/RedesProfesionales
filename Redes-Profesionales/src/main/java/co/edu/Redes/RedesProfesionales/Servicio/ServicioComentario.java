package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Comentario;
import co.edu.Redes.RedesProfesionales.Repositorio.ComentarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioComentario {

    @Autowired
    private ComentarioRepositorio repositorioComentario;

    public Comentario crearComentario(Comentario comentario) {
        return repositorioComentario.save(comentario);
    }

    public List<Comentario> obtenerComentariosPorPublicacion(String idPublicacion) {
        return repositorioComentario.findByPublicacionId(idPublicacion);
    }

    public void eliminarComentario(String idComentario) {
        repositorioComentario.deleteById(idComentario);
    }

	public Comentario crearComentario(String usuarioId, String contenidoComentario, String contenidoPublicacion,
			String fechaPublicacion) {
		return null;
	}
}

