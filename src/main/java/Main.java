import Ejercicios.Ejercicio1;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    Ejercicio1 resul = new Ejercicio1();
    Scanner teclado = new Scanner(System.in);


    public static void main(String[]args){
    Main main = new Main();
   /* main.comparateNumbers();
    main.ConsolaCompararNumeros();
    main.CalcularRadio();
    main.calcularPrecio();*/
    main.numParesImpares();



    }


    void ConsolaCompararNumeros(){
        String num1,num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer Numero");
        num1=teclado.next();
        System.out.println("Ingrese el segundo numero");
        num2=teclado.next();

        System.out.println(resul.ConsolaCompararNumeros(num1,num2));
    }

    void comparateNumbers() {
        System.out.println(resul.comparateNumbers(5, 6));
    }
    void CalcularRadio(){
      String radio;
        System.out.println("Ingrese el valor del radio");

        radio = teclado.next();

        System.out.println("El radio del circulo es: "+resul.CalcularCirculo(radio));
    }

    void calcularPrecio(){
        String precio;
        System.out.println("Ingrese el valor del Producto: ");
        precio = teclado.next();

        System.out.println("El valor total del producto es: "+resul.CalcularPrecioProducto(precio));
    }

    void numParesImpares(){
        String result;
        int vector1[] = new int[100];

        for (int i = 1; i<=vector1.length;i++){
            vector1[i-1] = i;
        }

        for (int i = 0; i< vector1.length ;i++){
                int numero = vector1[i] % 2;
            if ( numero == 0){
                result =  "El numero: " + i + " Es un # Par";
            }else{
                result= "Es numero: "+i+" es Impar";
            }
            System.out.println(result);
        }

    }

}
