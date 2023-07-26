import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fil = 0;
        int col = 0;

        do {

            System.out.println("Ingrese el numero filas");
            fil = sc.nextInt();

            System.out.println("Ingrese el numero columnas");
            col = sc.nextInt();

            if (fil != col ) {
                System.out.println("La matriz no es del mismo tamano");
            }

        } while (fil != col);

        int[][] matriz1 = new int[fil][col];
        int[][] matriz2 = new int[fil][col];
        int[][] matrizSuma = new int[fil][col];

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {
                matriz1[i][j] = (int) (Math.random()*10+1);
                matriz2[i][j] = (int) (Math.random()*10+1);
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }

        }

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < fil; i++) {

            for (int j = 0; j < col; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }

    }

}