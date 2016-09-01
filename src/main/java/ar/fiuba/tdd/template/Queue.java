package ar.fiuba.tdd.template;

import org.omg.CORBA.Object;


/**
 * Created by alazraqui on 30/08/2016.
 */
public class Queue<T> implements IQueue<T> {
    private NodoAbstracto<T>  primerNodo;

    public boolean isEmpty() {
        return this.primerNodo.getSize() == 0;
    }

    public int size() {
        return primerNodo.getSize();
    }

    public void add(T item) {
        if (this.isEmpty()) {
            this.primerNodo = new Nodo<T>(item);
        } else {
            this.primerNodo.siguienteNodo.add(item,this.primerNodo);
        }


    }

    public void remove() throws  AssertionError {
        this.primerNodo = this.primerNodo.getSiguienteNodo();
    }

    public T top() throws AssertionError {
        return primerNodo.getValue();
    }

    public Queue() {
        this.primerNodo = new NodoNulo<T>();
    }
}




