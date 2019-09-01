import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] grades = new int[size];

        for (int i = 0; i < size; i++) {
            grades[i] = sc.nextInt();
            grades[i] = (grades[i] >= 38) ? ((grades[i] % 5 >= 3) ? (grades[i] + (5 - (grades[i] % 5))) : grades[i]) : grades[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(grades[i]);
        }

    }
}
