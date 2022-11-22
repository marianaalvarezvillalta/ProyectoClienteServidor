package proyectofinal_progracs;

public class ColaEmpleados {
    private NodoColaEmpleado frente;
    private NodoColaEmpleado ultimo;
    public int largo;

    public ColaEmpleados() {
    }

    //metodo que agrega una orden a la cola
    public void encola(Empleado empleado) {

        NodoColaEmpleado nodito = new NodoColaEmpleado();
        nodito.setEmpleado(empleado);
        nodito.setAtras(null);

        if (ColaVacia()) {
            //si está vacía el primer nodo lo define como primero y último
            frente = nodito;
            ultimo = nodito;
        } else {
            //si no está vacía el nuevo nodo lo manda de último
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
        largo++;
    }

    //metodo para determinar si la cola está vacía
    public boolean ColaVacia() {

        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toStringColaEmpleado() {
        String stringConTodalaInfodelaCola = "";
        NodoColaEmpleado aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getEmpleado().toStringEmpleado() + "\n";
            aux = aux.getAtras();
        }
        stringConTodalaInfodelaCola = "<Frente>\n"
                + stringConTodalaInfodelaCola + "\n<Final>";
        return stringConTodalaInfodelaCola;
    }
}
