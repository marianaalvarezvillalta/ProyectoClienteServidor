package proyectofinal_progracs;

public class Empleado extends Persona{
    protected int idEmpleado;

    public Empleado(String nombre, int edad, int idEmpleado) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String toStringEmpleado() {
        return "\n----Empleado----"
                + "\nNombre: "+nombre
                + "\nEdad: "+edad
                + "\nID de Empleado: "+idEmpleado
                +"\n";
    }
}
