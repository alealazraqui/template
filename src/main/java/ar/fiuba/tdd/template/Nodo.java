package ar.fiuba.tdd.template;

/**
 * Created by alazraqui on 31/08/2016.
 */
public class Nodo<T> extends  NodoAbstracto<T> {

    @Override
    public NodoAbstracto<T> getSiguienteNodo() {
        return this.siguienteNodo;
    }

    @Override
    public T getValue() {
        return this.valor;
    }

    @Override
    public void setValue(T valor) {
        this.valor = valor;
    }


    @Override
    public void setSiguienteNodo(NodoAbstracto siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    @Override
    public int getSize() {
        return 1 + this.siguienteNodo.getSize();
    }

    @Override
    public void add(T item, NodoAbstracto<T> nodoAnterior) {
        this.siguienteNodo.add(item,this);
    }

    public Nodo(T valor) {
        this.valor = valor;
        this.siguienteNodo = new NodoNulo();
    }

}
