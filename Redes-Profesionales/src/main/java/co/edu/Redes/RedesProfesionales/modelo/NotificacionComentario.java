package co.edu.Redes.RedesProfesionales.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notificaciones")
public class NotificacionComentario extends Notificacion {

    private String comentarioId;

    public NotificacionComentario(String usuarioId, String mensaje, String comentarioId) {
        super(usuarioId, mensaje);
        this.comentarioId = comentarioId;
    }

    public String getComentarioId() {
        return comentarioId;
    }

    public void setComentarioId(String comentarioId) {
        this.comentarioId = comentarioId;
    }
}

