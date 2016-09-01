package ar.fiuba.tdd.template;

import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

/**
 * Created by alazraqui on 01/09/2016.
 */
public class QueueTests {
    public Queue<Integer> cola;

    @Before
    public void setUp() {
        this.cola = new Queue<Integer>();
    }

    @Test
    public void colaEstaVacia_ok() {
        assertTrue(cola.isEmpty());
    }

    @Test(expected = AssertionError.class)
    public void colaBorroVacio_TiraError() {
        this.cola.remove();
    }

    @Test
    public void colaVaciaSizeDaCero_ok() {
        assertTrue(cola.size() == 0);
    }

    @Test(expected = AssertionError.class)
    public void colaVaciaBuscoTop_TiraError() {
        this.cola.top();
    }

    @Test
    public void colaConUnoDaSizeUno_ok() {
        this.cola.add(1);
        assertTrue(cola.size() == 1);
    }

    @Test
    public void colaConUnoNoDaVacia_ok() {
        this.cola.add(1);
        assertTrue(!cola.isEmpty());
    }

    @Test
    public void colaConUnoDaTopUno_ok() {
        this.cola.add(1);
        assertTrue(cola.top() == 1);
    }

    @Test
    public void colaConTresElementosDaSizeTres_ok() {
        this.cola.add(1);
        this.cola.add(2);
        this.cola.add(3);
        assertTrue(cola.size() == 3);
    }

    @Test
    public void colaConTresElementosRemueveDevuelveTop2_ok() {
        this.cola.add(1);
        this.cola.add(2);
        this.cola.add(3);
        this.cola.remove();
        assertTrue(cola.top() == 2);
    }

    @Test
    public void colaAgregarYRemoverAlternadamenteDevuelveTop_ok() {
        this.cola.add(1);
        this.cola.add(2);
        this.cola.remove();
        this.cola.add(3);
        this.cola.remove();
        assertTrue(cola.top() == 3);
    }

    @Test(expected = AssertionError.class)
    public void colaEliminoMasDeLoQueAgrego_ok() {
        this.cola.add(1);
        this.cola.add(2);
        this.cola.add(3);
        this.cola.remove();
        this.cola.remove();
        this.cola.remove();
        this.cola.remove();
    }
}


