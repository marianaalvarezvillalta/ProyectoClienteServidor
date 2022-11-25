package proyectofinal_progracs;

import javax.swing.JOptionPane;

public class ListaCitas {

    private NodoLista cabeza;

    public void inserta(Cita cita) {
        if (cabeza == null) {
            cabeza = new NodoLista(cita);
        } else if (cita.getHora() < cabeza.getCita().getHora()) {
            NodoLista aux = new NodoLista(cita);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            cabeza.setNext(new NodoLista(cita));
        } else {
            NodoLista aux = cabeza;
            while (aux.getNext() != null
                    && aux.getNext().getCita().getHora() < cita.getHora()) {
                aux = aux.getNext();
            }
            NodoLista temp = new NodoLista(cita);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }

    public boolean existe(int hora) {//mariana
        boolean esta = false;
        //Busca en lista, y retorna true si una persona tiene el id
        //en la lista
        if (cabeza != null) {
            //Si hay algo en la lista buscaré
            NodoLista aux = cabeza;
            //utilizo aux como indice

            //Mientras no se acabe la lista y el elemento
            //de la lista sea menor que el buscado
            while (aux != null && aux.getCita().getHora() < hora) {
                aux = aux.getNext();//avanzo en la lista
            }

            //verdadero si lo encontró
            esta = (aux != null && aux.getCita().getHora() == hora);
        }

        return esta;
    }

    public NodoLista eliminaPrimero() {
        NodoLista aux = cabeza;
        if (cabeza != null) {
            cabeza = cabeza.getNext();
            aux.setNext(null);
        } else {
            JOptionPane.showMessageDialog(null, "No hay citas registradas");
        }
        return aux;
    }

    public String toStringListaCitas() {
        NodoLista aux = cabeza;
        String s = "\nLista de Citas:\n";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }

    public String toStringCabeza() {
        NodoLista aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
        }
        return s;
    }
}

