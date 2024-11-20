package co.edu.Redes.RedesProfesionales.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notificaciones")
public class NotificacionPublicacion extends Notificacion {

    private String publicacionId;

    public NotificacionPublicacion(String usuarioId, String mensaje, String publicacionId) {
        super(usuarioId, mensaje);
        this.publicacionId = publicacionId;
    }

    public String getPublicacionId() {
        return publicacionId;
    }

    public void setPublicacionId(String publicacionId) {
        this.publicacionId = publicacionId;
    }
}

