package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.Notificacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NotificacionRepositorio extends MongoRepository<Notificacion, String> {
    List<Notificacion> findByUsuarioId(String usuarioId);
}

