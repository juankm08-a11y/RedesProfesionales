package co.edu.Redes.RedesProfesionales.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;;
@Document(collection = "usuarios")
public class Usuario {

    @Id
    private String id;
    private String nombre;
    private String correo;
    private String contrasena;
    private Date fechaRegistro;
    private String perfil;  

    public Usuario(String nombre, String correo, String contrasena, Date fechaRegistro) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
        this.perfil = "";  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void crearPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String verPerfil() {
        return this.perfil;
    }
}
