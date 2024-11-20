package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Perfil;
import co.edu.Redes.RedesProfesionales.Repositorio.RepositorioPerfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioPerfil {

    @Autowired
    private RepositorioPerfil repositorioPerfil;

    public Optional<Perfil> obtenerPerfilPorIdUsuario(String usuarioId) {
        return repositorioPerfil.findByUsuarioId(usuarioId);
    }

    public Perfil guardarPerfil(Perfil perfil) {
        return repositorioPerfil.save(perfil);
    }

    public void eliminarPerfil(String id) {
        repositorioPerfil.deleteById(id);
    }
}

