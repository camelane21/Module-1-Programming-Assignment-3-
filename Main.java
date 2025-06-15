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