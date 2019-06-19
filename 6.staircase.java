
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String stair = "";
        String space = " ";

        for (int i = 0; i < t; i++) {
            for (int j = t - i - 2; j >= 0; j--) {
                System.out.print(space);
            }
            stair += "#";
            System.out.print(stair);
            System.out.println();
        }
    }
}
