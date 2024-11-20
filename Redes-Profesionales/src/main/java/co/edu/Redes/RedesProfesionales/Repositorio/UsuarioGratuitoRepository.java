package co.edu.Redes.RedesProfesionales.Repositorio;

import co.edu.Redes.RedesProfesionales.modelo.UsuarioGratuito;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioGratuitoRepository extends MongoRepository<UsuarioGratuito, String> {
    Optional<UsuarioGratuito> findByNombreUsuario(String nombreUsuario);
}
