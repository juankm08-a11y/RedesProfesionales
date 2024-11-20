package co.edu.Redes.RedesProfesionales.modelo;
import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comentarios")
public class Comentario extends Publicacion {

    private String usuarioId;
    private String contenidoComentario;

    public Comentario(String usuarioId, String contenidoComentario, String contenido, Date fechaPublicacion) {
        super(usuarioId, contenido, fechaPublicacion); 
        this.usuarioId = usuarioId;
        this.contenidoComentario = contenidoComentario;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getContenidoComentario() {
        return contenidoComentario;
    }

    public void setContenidoComentario(String contenidoComentario) {
        this.contenidoComentario = contenidoComentario;
    }
}
