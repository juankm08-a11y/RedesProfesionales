package co.edu.Redes.RedesProfesionales.modelo;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios_gratuitos")
public class UsuarioGratuito extends Usuario {

    private int limitePublicaciones;

    public UsuarioGratuito(String nombre, String correo, String contrasena, Date fechaRegistro, int limitePublicaciones) {
        super(nombre, correo, contrasena, fechaRegistro);
        this.limitePublicaciones = limitePublicaciones;
    }

    public int getLimitePublicaciones() {
        return limitePublicaciones;
    }

    public void setLimitePublicaciones(int limitePublicaciones) {
        this.limitePublicaciones = limitePublicaciones;
    }

    @Override
    public void crearPerfil(String perfil) {
        super.crearPerfil(perfil + " - Usuario Gratuito");
    }

    @Override
    public String verPerfil() {
        return super.verPerfil() + " - Limite de publicaciones: " + limitePublicaciones;
    }
}
