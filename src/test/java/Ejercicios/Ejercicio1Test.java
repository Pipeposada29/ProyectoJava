package Ejercicios;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio1Test {

    static Ejercicio1 resultado;

    @BeforeAll
     static void initAll(){
        resultado  = new Ejercicio1();
        System.out.println("Entra  al BeforeAll");

    }
    @BeforeEach
    void init(){
        System.out.println("Entre al BeforeEach");
    }

    @Test
    void deberianSerNumerosIguales() {

        String mensaje= resultado.comparateNumbers(5,5);
        System.out.println("Entre al deberianSerNumerosIguales");
        assertEquals("Los numeros son iguales",mensaje);
    }

    @Test
    void deberianSerElPrimerNumeroMayor() {

        String mensaje= resultado.comparateNumbers(6,5);
        System.out.println("Entre al deberianSerElPrimerNumeroMayor");
        assertEquals("El numero 1 es mayor al numero 2",mensaje);
    }

    @Test
    void deberianSerElSegundoNumeroMayor() {

        String mensaje= resultado.comparateNumbers(6,8);
        System.out.println("Entre al deberianSerElSegundoNumeroMayor");
        assertEquals("El numero 2 es mayor al numero 1",mensaje);
    }
    @Test
    void deberianSerElSegundoNumeroMayorConsola(){
        String mensaje = resultado.ConsolaCompararNumeros("1","2");
        assertEquals("El numero 2 es mayor al numero 1",mensaje);
    }
    @Test
    void deberianSerElPrimerNumeroMayorConsola(){
        String mensaje = resultado.ConsolaCompararNumeros("5","2");
        assertEquals("El numero 1 es mayor al numero 2",mensaje);
    }
    @Test
    void deberianSerLosNumerosIgualesConsola(){
        String mensaje = resultado.ConsolaCompararNumeros("5","5");
        assertEquals("Los numeros son iguales",mensaje);
    }
    @Test
    void deberianDebolverNumberFormatException(){
      assertThrows(NumberFormatException.class, ()-> resultado.ConsolaCompararNumeros("L","5"));
    }
    @Test
    void deberiaCalcularRadio(){
    double calculo=resultado.CalcularCirculo("3");
    assertEquals(28.26,calculo);
    }
    @Test
    void deberiaCalculoRadioNumberFormatException(){
        assertThrows(NumberFormatException.class, ()-> resultado.CalcularCirculo("l"));
    }
    @Test
    void deberiaCalcularElPrecioDelProducto(){
        double calculo=resultado.CalcularPrecioProducto("5000");
        assertEquals(6050.0,calculo);
    }
    @Test
    void deberiaCalcularElPrecioProductoNumberFormatException(){
        assertThrows(NumberFormatException.class, ()-> resultado.CalcularPrecioProducto("l"));
    }

    @AfterEach
    void taerDown(){
        System.out.println("Entre al AfterEach");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Entre al AfterAll");
    }

}