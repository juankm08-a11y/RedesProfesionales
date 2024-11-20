package co.edu.Redes.RedesProfesionales.Repositorio;


import co.edu.Redes.RedesProfesionales.modelo.Reaccion;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReaccionRepositorio extends MongoRepository<Reaccion, String> {
    List<Reaccion> findByPublicacionId(String publicacionId);
}

