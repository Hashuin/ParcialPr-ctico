package listasimple.src;

import java.util.Scanner;


public class App {

        public static Scanner sc = new Scanner(System.in);
        public static int i,j;
        public static void main(String[] args) {
            int J,K;
            System.out.println("Filas");
            J = sc.nextInt();
            System.out.println("Columnas");
            K = sc.nextInt();
            System.out.println("Ingresar matriz(mapa)");
            String [ ][ ]mat = new String[J][K];
            llenar(mat);
            System.out.println("Matriz");
            mostrarMatriz(mat);
        }
        private static void llenar(String[][]mat)   {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    mat[i][j]=sc.next();
                }
            }
        }
        private static void mostrarMatriz(String[][] mat) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j]+"\t");
                }
              System.out.println();
            }
        }
}
        




