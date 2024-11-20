package co.edu.Redes.RedesProfesionales.modelo;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "publicaciones")
public class Publicacion {

    @Id
    private String id;
    private String usuarioId;
    private String contenido;
    private Date fechaPublicacion;

    public Publicacion(String usuarioId, String contenido, Date fechaPublicacion) {
        this.usuarioId = usuarioId;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}

