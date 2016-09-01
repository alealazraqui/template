package ar.fiuba.tdd.template;


/**
 * Created by alazraqui on 30/08/2016.
 */
interface IQueue<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    T top();

    void remove();
}
