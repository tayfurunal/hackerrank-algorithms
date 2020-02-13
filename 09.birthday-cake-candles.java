import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int age;
        int max = 0;
        int count = 0;
        int howManyCandles = 0;
        age = scanner.nextInt();
        int[] array = new int[age];
        for (int i = 0; i < age; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < age; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        for (int i = 0; i < age; i++) {
            if (array[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
