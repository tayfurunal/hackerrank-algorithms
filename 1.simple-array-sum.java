import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        int length;
        int sum = 0;d

        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        
        for (int i = 0; i < length; i++)
        {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
