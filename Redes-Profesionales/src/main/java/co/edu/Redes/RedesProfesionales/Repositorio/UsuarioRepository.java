package co.edu.Redes.RedesProfesionales.Repositorio;


import co.edu.Redes.RedesProfesionales.modelo.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
