package ar.fiuba.tdd.template;

/**
 * Created by alazraqui on 31/08/2016.
 */
public class NodoNulo<T> extends  NodoAbstracto<T>  {
    private static final String ERROR_VACIO = "La Lista Está Vacia";

    @Override
    public NodoAbstracto<T> getSiguienteNodo() throws AssertionError {
        throw new AssertionError(ERROR_VACIO);
    }

    @Override
    public T getValue() throws AssertionError {
        throw new AssertionError(ERROR_VACIO);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void add(T item, NodoAbstracto<T> nodoAnterior) {
        nodoAnterior.siguienteNodo = new Nodo<T>(item);
    }


    public NodoNulo(){}

}
