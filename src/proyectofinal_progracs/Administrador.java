package proyectofinal_progracs;

public class Administrador extends Persona{
    protected int idAdministrador;

    public Administrador(String nombre, int edad, int idAdministrador) {
        super(nombre, edad);
        this.idAdministrador = idAdministrador;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    
    public String toStringAdministrador() {
        return "\n----Administrador----"
                + "\nNombre: "+nombre
                + "\nEdad: "+edad
                + "\nID de Administrador: "+idAdministrador;
    }
}
