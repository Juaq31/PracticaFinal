
package practicafinal;

/**
 * Ingresa y retira saldo de la cuenta
 * @author JuancamiloBR
 * @version 04/02/2026
 */

public class CCuenta {

    double dSaldo;
    int contador;

    public static void main(String[] args){
        // Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada con codicion de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");

    }

    /**
     * Ingresa saldo a la cuenta
     * @param cantidad saldo a ingresar
     * @return devuelve Código de error
     */

    public int ingresar(int cantidad) {
        int iCodErr;
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuracion. Punto de parada. Solo en el 3 ingreso
            contador++;
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        // Depuracion. Punto de parada cuando la cantidad  es menor de 0
        return iCodErr;

    }

    /**
     * Retira saldo de la cuenta
     * @param cantidad saldo a retirar
     */

    public void retirar (double cantidad)
    {
        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (dSaldo < cantidad)
        {
            System.out.println("No se hay suficiente saldo");
        }
        else
        {
            dSaldo = dSaldo - cantidad;
        }
    }



}
