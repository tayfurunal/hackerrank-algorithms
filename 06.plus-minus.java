import java.util.*;

public class Solution {

    public static void main(String[] args) {
        float positives = 0;
        float negatives = 0;
        float zeroes = 0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positives++;
            }
            if (array[i] < 0) {
                negatives++;
            }
            if (array[i] == 0) {
                zeroes++;
            }
        }

        System.out.println(positives / n);
        System.out.println(negatives / n);
        System.out.println(zeroes / n);
    }
}
