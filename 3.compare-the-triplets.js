
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alice = userInput(in);
        int[] bob = userInput(in);
        tripletCompare(alice, bob);
    }

    public static int[] userInput(Scanner in) {
        int[] triplet = new int[3];
        for (int i = 0; i < 3; i++) {
            a triplet[i
            ] = in.nextInt();
        }
        return triplet;
    }

    public static void tripletCompare(int[] alice, int[] bob) {
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < 3; i++) {
            if (alice[i] < bob[i]) {
                bobScore++;
            } else if (alice[i] > bob[i]) {
                aliceScore++;
            }
        }
        System.out.println(aliceScore + " " + bobScore);
    }
}
