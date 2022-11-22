package proyectofinal_progracs;

public class NodoColaAdministrador {
    private NodoColaAdministrador atras;
    private Administrador administrador;

    public NodoColaAdministrador() {
    }

    public NodoColaAdministrador(NodoColaAdministrador atras, Administrador administrador) {
        this.atras = atras;
        this.administrador = administrador;
    }

    public NodoColaAdministrador getAtras() {
        return atras;
    }

    public void setAtras(NodoColaAdministrador atras) {
        this.atras = atras;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "NodoColaAdministrador{" + "atras=" + atras + ", administrador=" + administrador + '}';
    }
    
    
}
