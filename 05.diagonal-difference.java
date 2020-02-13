import java.io.*;
import java.math.*;
import java.util.*;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        int diag1 = 0;
        int diag2 = 0;

        Scanner input = new Scanner(System.in);
        int arSize = input.nextInt();
        int matrix[][] = new int[arSize][arSize];
        for (int i = 0; i < arSize; i++) {
            for (int j = 0; j < arSize; j++) {
                matrix[i][j] = input.nextInt();
                if (i == j) {
                    diag1 += matrix[i][j];
                }
                if (i + j == arSize - 1) {
                    diag2 += matrix[i][j];
                }
            }
        }

        System.out.print(abs(diag1 - diag2));
    }
}