// Q.1>>   Java Program to find average of an int Array.

import java.util.*;
public class solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("plese enter the range first : ");
        int n = sc.nextInt();
        System.out.println("you can start entering your numbers : ");
        int arr[] = new int[n];
        for ( int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i=0; i<n; i++) {
            sum=sum+arr[i];
        }
        float avg = sum/n;
        System.out.println("your avg is = "+ avg);
    }
    
}
