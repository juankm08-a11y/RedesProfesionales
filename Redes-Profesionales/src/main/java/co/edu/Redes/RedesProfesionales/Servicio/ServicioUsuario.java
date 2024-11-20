package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Usuario;
import co.edu.Redes.RedesProfesionales.modelo.UsuarioGratuito;
import co.edu.Redes.RedesProfesionales.modelo.UsuarioPremium;
import co.edu.Redes.RedesProfesionales.Repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuario {

    @Autowired
    private UsuarioRepository repositorioUsuario;

    public List<Usuario> obtenerTodosLosUsuarios() {
        return repositorioUsuario.findAll();
    }

    public Optional<Usuario> obtenerUsuarioPorId(String id) {
        return repositorioUsuario.findById(id);
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    public void eliminarUsuario(String id) {
        repositorioUsuario.deleteById(id);
    }

    public Optional<Usuario> obtenerUsuarioPorNombre(String nombreUsuario) {
        return repositorioUsuario.findByNombreUsuario(nombreUsuario);
    }

	public Usuario crearUsuario(Usuario usuario) {
		return null;
	}

	public UsuarioGratuito crearUsuarioGratuito(UsuarioGratuito usuarioGratuito) {
		return null;
	}

	public UsuarioPremium crearUsuarioPremium(UsuarioPremium usuarioPremium) {
		return null;
	}
}

