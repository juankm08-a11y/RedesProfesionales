package co.edu.Redes.RedesProfesionales.Servicio;

import co.edu.Redes.RedesProfesionales.modelo.Notificacion;
import co.edu.Redes.RedesProfesionales.Repositorio.NotificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioNotificacion {

    @Autowired
    private NotificacionRepositorio repositorioNotificacion;

    public List<Notificacion> obtenerTodasLasNotificaciones() {
        return repositorioNotificacion.findAll();
    }

    public Optional<Notificacion> obtenerNotificacionPorId(String id) {
        return repositorioNotificacion.findById(id);
    }

    public List<Notificacion> obtenerNotificacionesPorUsuario(String usuarioId) {
        return repositorioNotificacion.findByUsuarioId(usuarioId);
    }

    public Notificacion guardarNotificacion(Notificacion notificacion) {
        return repositorioNotificacion.save(notificacion);
    }

    public void eliminarNotificacion(String id) {
        repositorioNotificacion.deleteById(id);
    }
}

