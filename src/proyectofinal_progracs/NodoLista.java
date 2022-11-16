/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_progracs;

/**
 *
 * @author joseriveratencio
 */
public class NodoLista {
    private Cita cita;
    private NodoLista next;

    public NodoLista(Cita cita) {
        this.cita = cita;
    }

    public NodoLista() {
    }
    
    @Override
    public String toString(){
        return "\n----Cita----"+cita;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }
    
    
}
