package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RepositorioPerfil extends MongoRepository<Perfil, String> {
    Optional<Perfil> findByUsuarioId(String usuarioId);
}

