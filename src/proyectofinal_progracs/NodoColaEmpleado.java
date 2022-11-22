package proyectofinal_progracs;

public class NodoColaEmpleado {
    private NodoColaEmpleado atras;
    private Empleado empleado;

    public NodoColaEmpleado() {
    }

    public NodoColaEmpleado(NodoColaEmpleado atras, Empleado empleado) {
        this.atras = atras;
        this.empleado = empleado;
    }

    public NodoColaEmpleado getAtras() {
        return atras;
    }

    public void setAtras(NodoColaEmpleado atras) {
        this.atras = atras;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "NodoColaEmpleado{" + "atras=" + atras + ", empleado=" + empleado + '}';
    }
    
}
