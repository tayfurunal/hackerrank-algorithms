import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    static long averybigsum(long[] ar) {
        long sum = 0;
        for (int x = 0; x < ar.length; x++) {
            sum += ar[x];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arSize = in.nextInt();
        long[] ar = new long[arSize];
        for (int x = 0; x < arSize; x++) {
            ar[x] = in.nextInt();
        }

        long result = averybigsum(ar);
        System.out.println(result);
    }
}
