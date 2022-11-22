package proyectofinal_progracs;

public class NodoColaCliente {
    private NodoColaCliente atras;
    private Cliente cliente;

    public NodoColaCliente() {
    }

    public NodoColaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoColaCliente getAtras() {
        return atras;
    }

    public void setAtras(NodoColaCliente atras) {
        this.atras = atras;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toStringNodoCola() {
        return "NodoCola{" + "next=" + atras + ", cliente=" + cliente + '}';
    }
    
}
