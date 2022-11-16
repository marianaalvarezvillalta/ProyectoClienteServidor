package proyectofinal_progracs;

public class NodoCola {
    private NodoCola atras;
    private Cliente cliente;

    public NodoCola() {
    }

    public NodoCola(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
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
