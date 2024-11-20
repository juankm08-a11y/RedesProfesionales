package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.UsuarioPremium;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioPremiumRepository extends MongoRepository<UsuarioPremium, String> {
    Optional<UsuarioPremium> findByNombreUsuario(String nombreUsuario);
}
