import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int samHouseStarting = scan.nextInt();
        int samHouseEnding = scan.nextInt();
        int appleTree = scan.nextInt();
        int orangeTree = scan.nextInt();
        int fallenApple = scan.nextInt();
        int fallenOrange = scan.nextInt();

        int applesOnHouse = 0;
        for (int i = 0; i < fallenApple; i++) {
            int applePosition = appleTree + scan.nextInt();
            if (applePosition >= samHouseStarting && applePosition <= samHouseEnding) {
                applesOnHouse++;
            }
        }

        int orangesOnHouse = 0;
        for (int i = 0; i < fallenOrange; i++) {
            int orangePosition = orangeTree + scan.nextInt();
            if (orangePosition >= samHouseStarting && orangePosition <= samHouseEnding) {
                orangesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);

        scan.close();
    }
}