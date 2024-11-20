package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.NotificacionComentario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotificacionComentarioRepositorio extends MongoRepository<NotificacionComentario, String> {
    List<NotificacionComentario> findByPublicacionId(String publicacionId);
}

