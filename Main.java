import java.util.Scanner;

public class Exercise08_29 {

    /** Return true if the two matrices have the same dimensions and contents */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) return false;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) return false;
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) return false;
            }
        }
        return true;
    }

      /** Print a 3×3 matrix on one line, space‐separated */
    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
                if (!(i == m.length - 1 && j == m[i].length - 1)) {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m1[i][j] = input.nextInt();

        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m2[i][j] = input.nextInt();
        
                