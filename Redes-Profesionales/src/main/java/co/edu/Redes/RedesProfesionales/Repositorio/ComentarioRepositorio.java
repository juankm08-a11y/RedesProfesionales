package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ComentarioRepositorio extends MongoRepository<Comentario, String> {
    List<Comentario> findByPublicacionId(String publicacionId);
}

