package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.NotificacionReaccion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotificacionReaccionRepositorio extends MongoRepository<NotificacionReaccion, String> {
    List<NotificacionReaccion> findByPublicacionId(String publicacionId);
}

