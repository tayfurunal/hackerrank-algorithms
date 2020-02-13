import java.util.*;

public class Solution {

        
    public static boolean hasFactors(int num, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isFactor(int num, int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%num!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int i=0; i < m; i++){
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int min = a[0];
        int max = b[b.length-1];
        int count=0;
        for(int i=min;i<=max;i++){
            if(hasFactors(i,a) && isFactor(i,b)){
                count++;
            }
        }
        System.out.println(count);
    }

}