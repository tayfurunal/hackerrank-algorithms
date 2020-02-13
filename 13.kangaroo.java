import java.util.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
     if(v2 >= v1&&x2>=x1||v1>=v2&&x1>=x2) {
            return "NO";
        }
        else if((x2-x1)%(v2-v1) == 0) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        String result = kangaroo(x1,v1,x2,v2);
        System.out.println(result);
    }
}