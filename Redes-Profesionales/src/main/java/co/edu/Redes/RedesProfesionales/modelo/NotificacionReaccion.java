package co.edu.Redes.RedesProfesionales.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notificaciones")
public class NotificacionReaccion extends Notificacion {

    private String reaccionId;

    public NotificacionReaccion(String usuarioId, String mensaje, String reaccionId) {
        super(usuarioId, mensaje);
        this.reaccionId = reaccionId;
    }

    public String getReaccionId() {
        return reaccionId;
    }

    public void setReaccionId(String reaccionId) {
        this.reaccionId = reaccionId;
    }
}


