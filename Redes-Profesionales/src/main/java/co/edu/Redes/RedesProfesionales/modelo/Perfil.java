package co.edu.Redes.RedesProfesionales.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "perfiles")
public class Perfil {

    @Id
    private String id;
    private String usuarioId;  
    private String descripcion;
    private String fotoPerfil;

    public Perfil(String usuarioId, String descripcion, String fotoPerfil) {
        this.usuarioId = usuarioId;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
}
