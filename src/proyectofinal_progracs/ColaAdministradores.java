package proyectofinal_progracs;

public class ColaAdministradores {
    private NodoColaAdministrador frente;
    private NodoColaAdministrador ultimo;
    public int largo;

    public ColaAdministradores() {
    }
    
    //metodo que agrega una orden a la cola
    public void encola(Administrador administrador) {

        NodoColaAdministrador nodito = new NodoColaAdministrador();
        nodito.setAdministrador(administrador);
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
    
    public String toStringColaAdministrador() {
        String stringConTodalaInfodelaCola = "";
        NodoColaAdministrador aux = frente;
        while (aux != null) {

            stringConTodalaInfodelaCola = stringConTodalaInfodelaCola
                    + aux.getAdministrador().toStringAdministrador() + "\n";
            aux = aux.getAtras();
        }
        stringConTodalaInfodelaCola = "<Frente>\n"
                + stringConTodalaInfodelaCola + "\n<Final>";
        return stringConTodalaInfodelaCola;
    }
}
