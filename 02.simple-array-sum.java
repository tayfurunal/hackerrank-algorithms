import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        int length;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        
        for (int i = 0; i < length; i++)
        {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
