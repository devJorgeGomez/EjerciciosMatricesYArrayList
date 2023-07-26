import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> enteros = new ArrayList<>();
        int grande = 0;

        System.out.println("Ingrese la cantidad de numeros enteros que desea ingresar");
        int num = sc.nextInt();

        for (int i=0; i < num; i++) {
            System.out.println("Ingresa un numero entero");
            int ingresar = sc.nextInt();

            if (ingresar > grande) {
                grande = ingresar;
            }

            enteros.add(ingresar);
        }

        System.out.println("El numero mas grande en la lista es: " + grande);

    }

}