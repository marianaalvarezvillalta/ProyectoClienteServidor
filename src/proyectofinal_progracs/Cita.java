package proyectofinal_progracs;

public class Cita {
    private Cliente cliente;
    private int idCita;
    private int hora;

    public Cita(Cliente cliente, int idCita, int hora) {
        this.cliente = cliente;
        this.idCita = idCita;
        this.hora = hora;
    }

    public Cita(int idCita, int hora) {
        this.idCita = idCita;
        this.hora = hora;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return ""
                +"\nCliente: "+cliente.getNombre()
                +"\nID de Cita: "+idCita
                +"\nHora: "+hora;
    }
    
}
