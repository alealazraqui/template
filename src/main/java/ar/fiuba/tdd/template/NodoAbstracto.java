package ar.fiuba.tdd.template;

import java.lang.Exception;

/**
 * Created by alazraqui on 31/08/2016.
 */
public abstract class NodoAbstracto<T> {
    private static final String ERROR_METODO_ABSTRACTO = "El metodo no posee implementacion";
    protected T valor;

    protected NodoAbstracto<T> siguienteNodo;

    public NodoAbstracto getSiguienteNodo() throws UnsupportedOperationException {
        throw  new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }

    public T getValue() throws UnsupportedOperationException {
        throw  new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }

    public void setValue(T valor) throws UnsupportedOperationException {
        throw  new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }

    public void setSiguienteNodo(NodoAbstracto siguienteNodo) throws UnsupportedOperationException {
        throw  new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }

    public int getSize() throws UnsupportedOperationException {
        throw  new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }

    public void add(T item,NodoAbstracto<T> nodoAnterior ) throws  UnsupportedOperationException {
        throw new UnsupportedOperationException(ERROR_METODO_ABSTRACTO);
    }
}
