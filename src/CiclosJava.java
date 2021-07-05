import java.util.Scanner;

public class CiclosJava {

    public static void main(String[] args) {
        /*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        */
        /*
        CICLO FOR:
        for(variable de inicialización; variable de inicialización < 10; variable++)


        for (int i=0; i < 10; i++) {
            System.out.println(i +1);
        }

        /*
            Crear un metodo que reciba por parametro un número y
            nos muestre la tabla de multiplicar de ese número
            Ejemplo:
            1 X 1 = 1
            1 X 2 = 2
            1 X 3 = 3
            ...
            1 X 10 = 10
        */

        System.out.println("Ingrese la tabla de multiplicar que desea");
        Scanner leerA = new Scanner(System.in);
        int a = leerA.nextInt();

        tablaDeMultiplicar(a);

    }

    public static void tablaDeMultiplicar(int a) {
        for (int i=1; i < 11; i++) {
            int resultado = a * i;
            System.out.println(a + " x " + i + " = " + resultado);
        }
    }

}
