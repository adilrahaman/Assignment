import java.util.*;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("plese enter the range first : ");
        int n = sc.nextInt();
        System.out.println("you can start entering your numbers : ");
        int arr[] = new int[n];
        for ( int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("your reversed array is = ");

        for (int j=0; j<n; j++) {
            System.out.print(arr[j]+ " ");
        }
    } 
}
