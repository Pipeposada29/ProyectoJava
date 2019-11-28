package Ejercicios;
import java.util.Scanner;
public class Ejercicio1 {

    static final double PI = 3.14;
    static final double IVA = 1.21;

    public String comparateNumbers(int number1, int number2) {
        String mensaje;
        if (number1 < number2) {
            mensaje = "El numero 2 es mayor al numero 1";
        } else if (number1 == number2) {
            mensaje = "Los numeros son iguales";
        } else {
            mensaje = "El numero 1 es mayor al numero 2";
        }

        return mensaje;
    }

    public String ConsolaCompararNumeros(String num1, String num2) {
        try {
            return comparateNumbers(Integer.parseInt(num1), Integer.parseInt(num2));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Debe digitar solo numeros");
        }


    }

    public double CalcularCirculo(String radio) {
        try {
            return PI * Math.pow(Double.parseDouble(radio),2);
        }catch (NumberFormatException e) {
            throw new NumberFormatException("Debe digitar solo numeros");

        }

    }
    public  double CalcularPrecioProducto(String precio){

        try {
           return Double.parseDouble(precio)*IVA;
        }catch  (NumberFormatException e) {
            throw new NumberFormatException("Debe digitar solo numeros");

        }
    }

    public String NumParesImpares(String result){

        try {
            return result;
        }catch  (NumberFormatException e) {
            throw new NumberFormatException("Debe digitar solo numeros");

        }


    }
}




