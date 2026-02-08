package practicafinal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CCuentaTest {

    @Test
    void testingresarCantidadNegativa() {
        CCuenta cuenta = new CCuenta();
        int resultado = cuenta.ingresar(-100);
        assertEquals(1, resultado);
        assertEquals(0,cuenta.dSaldo);
    }


    @Test
    void testIngresarCantidadCorrecta() {
        CCuenta cuenta = new CCuenta();
        int resultado = cuenta.ingresar(100);
        assertEquals(0, resultado);
        assertEquals(100,cuenta.dSaldo);
    }


    @Test
    void testRetirarCorrecto() {
        CCuenta cuenta = new CCuenta();
        cuenta.ingresar(360);
        cuenta.retirar(60);
        assertEquals(300, cuenta.dSaldo);
    }

    @Test
    void testRetirarIncorrecto() {
        CCuenta cuenta = new CCuenta();
        cuenta.retirar(10);
        assertEquals(0, cuenta.dSaldo);
    }


}