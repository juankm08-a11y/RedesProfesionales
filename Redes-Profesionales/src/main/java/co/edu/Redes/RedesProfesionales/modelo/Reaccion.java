package co.edu.Redes.RedesProfesionales.modelo;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reacciones")
public class Reaccion extends Publicacion {

    private String tipoReaccion;  

    public Reaccion(String usuarioId, String tipoReaccion, String contenido, Date fechaPublicacion) {
        super(usuarioId, contenido, fechaPublicacion); 
        this.tipoReaccion = tipoReaccion;
    }

    public String getTipoReaccion() {
        return tipoReaccion;
    }

    public void setTipoReaccion(String tipoReaccion) {
        this.tipoReaccion = tipoReaccion;
    }
}

