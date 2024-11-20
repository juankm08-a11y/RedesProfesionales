package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.Publicacion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PublicacionRepositorio extends MongoRepository<Publicacion, String> {
    List<Publicacion> findByUsuarioId(String usuarioId);
}

