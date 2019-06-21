import java.util.*;

public class Solution {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        long sum = 0;
        long[] array = new long[5];

        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();
            sum += array[i];
        }

        long min = sum - array[0];
        long max = sum - array[0];

        for (int i = 1; i < 5; i++) {
            long temp = sum - array[i];
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }

        System.out.print(min + " " + max);
    }
}
