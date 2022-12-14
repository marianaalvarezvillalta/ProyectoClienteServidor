package proyectofinal_progracs;

public class ColaClientes {
    private NodoColaCliente frente;
    private NodoColaCliente ultimo;
    public int largo;

    public ColaClientes() {
    }

    //metodo que agrega una orden a la cola
    public void encola(Cliente cliente) {

        NodoColaCliente nodito = new NodoColaCliente();
        nodito.setCliente(cliente);
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

    //metodo que elimina al primero de la cola
    public NodoColaCliente eliminaPrimero() {

        NodoColaCliente aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        largo--;
        return aux;
    }

    public String toStringColaClientes() {
        String stringConTodalaInfodelaCola = "";
        NodoColaCliente aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getCliente().toStringCliente() + "\n";
            aux = aux.getAtras();
        }
        stringConTodalaInfodelaCola = "<Frente>\n"
                + stringConTodalaInfodelaCola + "\n<Final>";
        return stringConTodalaInfodelaCola;
    }
}
