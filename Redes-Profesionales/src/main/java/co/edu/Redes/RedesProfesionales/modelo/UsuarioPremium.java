package co.edu.Redes.RedesProfesionales.modelo;

import java.util.Date;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios_premium")
public class UsuarioPremium extends Usuario {

    private boolean accesoAvanzado;

    public UsuarioPremium(String nombre, String correo, String contrasena, Date fechaRegistro, boolean accesoAvanzado) {
        super(nombre, correo, contrasena, fechaRegistro);
        this.accesoAvanzado = accesoAvanzado;
    }

    public boolean isAccesoAvanzado() {
        return accesoAvanzado;
    }

    public void setAccesoAvanzado(boolean accesoAvanzado) {
        this.accesoAvanzado = accesoAvanzado;
    }

    @Override
    public void crearPerfil(String perfil) {
        super.crearPerfil(perfil + " - Usuario Premium");
    }

    @Override
    public String verPerfil() {
        return super.verPerfil() + " - Acceso avanzado: " + (accesoAvanzado ? "Sí" : "No");
    }
}
