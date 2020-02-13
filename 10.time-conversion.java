
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class Solution {

    static String timeConversion(String[] arrOfStr) {
        int translatedHours = 0;
        if (arrOfStr[2].contains("PM")) {
            if ("12".equals(arrOfStr[0])) {
                return arrOfStr[0] + ":" + arrOfStr[1] + ":" + arrOfStr[2].substring(0, 2);
            } else {
                translatedHours = Integer.parseInt(arrOfStr[0]) + 12;
                return translatedHours + ":" + arrOfStr[1] + ":" + arrOfStr[2].substring(0, 2);
            }

        } else {
            if ("12".equals(arrOfStr[0])) {
                return "00" + ":" + arrOfStr[1] + ":" + arrOfStr[2].substring(0, 2);
            } else {
                return arrOfStr[0] + ":" + arrOfStr[1] + ":" + arrOfStr[2].substring(0, 2);
            }
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();
        String[] arrOfStr = s.split(":", -2);

        String result = timeConversion(arrOfStr);
        System.out.println(result);
    }

}
