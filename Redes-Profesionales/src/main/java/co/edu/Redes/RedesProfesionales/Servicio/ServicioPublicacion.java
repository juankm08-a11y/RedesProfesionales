package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Publicacion;
import co.edu.Redes.RedesProfesionales.Repositorio.PublicacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioPublicacion {

    @Autowired
    private PublicacionRepositorio repositorioPublicacion;

    public List<Publicacion> obtenerTodasLasPublicaciones() {
        return repositorioPublicacion.findAll();
    }

    public Optional<Publicacion> obtenerPublicacionPorId(String id) {
        return repositorioPublicacion.findById(id);
    }

    public List<Publicacion> obtenerPublicacionesPorUsuario(String usuarioId) {
        return repositorioPublicacion.findByUsuarioId(usuarioId);
    }

    public Publicacion guardarPublicacion(Publicacion publicacion) {
        return repositorioPublicacion.save(publicacion);
    }

    public void eliminarPublicacion(String id) {
        repositorioPublicacion.deleteById(id);
    }
}
