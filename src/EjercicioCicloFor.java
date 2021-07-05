import java.util.Scanner;

public class EjercicioCicloFor {

    public static void main(String[] args) {

        /*
         Hacer un programa que pida un número por teclado
         Se tiene que hacer un recorrido desde 1 hasta el numero introducido
         - Tiene que imprimir la suma de los numeros pares e impares

         Ejemplo:
         N.Introducido: 12

         números pares = 2 + 4 + 6 + 8 + 10 + 12
         números pares = 1 + 3 + 5 + 7 + 9 + 11
        */

        System.out.println("Ingrese un número");
        Scanner leerNum = new Scanner(System.in);
        int num = leerNum.nextInt();
        cicloPar(num);

    }

    public static void cicloPar(int num) {
        int numPar = 0;
        int numImpar = 0;
        System.out.println("Numeros pares: ");
        for (int i=2; i < num + 1; i+=2) {
            System.out.print(" + " + i);
            numPar += i;
        }
        System.out.println(" = " + numPar);
        System.out.println("Numeros impares: ");
        for (int i=1; i < num + 1; i+=2) {
            System.out.print(" + " + i);
            numImpar += i;
        }
        System.out.println(" = " + numImpar);
    }

}
