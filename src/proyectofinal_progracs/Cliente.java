package proyectofinal_progracs;

public class Cliente extends Persona{
    protected int idCliente;

    public Cliente(String nombre, int edad, int idCliente) {
        super(nombre, edad);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String toStringCliente() {
        return "\n----Cliente----"
                + "\nNombre: "+nombre
                + "\nEdad: "+edad
                + "\nID de Cliente: "+idCliente
                +"\n";
    }
    
}
