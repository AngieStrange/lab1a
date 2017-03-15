import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws WrongKException {

        Random r = new Random();

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = r.nextInt(7);
            }
        }


        printMatrix(matrix);

        matrixDealer md = new matrixDealer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("к1=");
        int k1 = scanner.nextInt();
        System.out.print("к2=");
        int k2 = scanner.nextInt();
        md.matrixStringSwap(matrix, k1, k2);

        printMatrix(matrix);


    }

    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }

            System.out.print("\n");
        }
    }


}
