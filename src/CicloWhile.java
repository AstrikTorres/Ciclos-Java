import java.util.Scanner;
public class CicloWhile {

    public static void main(String[] args) {

        /* CICLO WHILE: Ejecuta el codigo si la condición es verdadera
           while(condición) {
               codigo
               codigo
               codigo
               codigo
           }        */
        /*
           CICLO DO WHILE: Ejecuta el codigo una primera vez y depende de la condicion para que se repita
           do {
              codigo;
              codigo;
              codigo;
           } while(condición);
         */

        /*
            Escribir un programa que pida 2 numeros por consola de manera reiterada
            La ejecucion del programa terminara cuando los numeros ingresados
            sean iguales.
        */

        cicloWhile();
        cicloDoWhile();

    }

    // Utilizando el ciclo while
    public static void cicloWhile() {
        Scanner num = new Scanner(System.in);
        int a = 0;
        int b = 1;
        while ( a !=  b ) {
            System.out.println("Ingrese su primer número");
            a = num.nextInt();
            System.out.println("Ingrese su segundo número");
            b = num.nextInt();
        }
        System.out.println("Terminó el ciclo while!");
    }

    // Utilizando el ciclo do while
    public static void cicloDoWhile() {
        int a;
        int b;
        Scanner num = new Scanner(System.in);
        do {
            System.out.println("Ingrese su primer número");
            a = num.nextInt();
            System.out.println("Ingrese su segundo número");
            b = num.nextInt();
        } while (a != b);
        System.out.println("Terminó el ciclo do while!");
    }

}
