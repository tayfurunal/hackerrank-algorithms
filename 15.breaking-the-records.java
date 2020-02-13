import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int match = scanner.nextInt();
        int scores[] = new int[match];
        for (int i = 0; i < match; i++) {
            scores[i] = scanner.nextInt();
        }
        int highest = scores[0];
        int lowest = scores[0];
        int highestCount = 0;
        int lowestCount = 0;

        for(int i = 1; i<match;i++){
            if(scores[i]>highest){
                highestCount++;
                highest=scores[i];
            }
            if(scores[i]<lowest){
                lowestCount++;
                lowest=scores[i];
            }

        }
        System.out.print(highestCount+" "+lowestCount);
    }
}