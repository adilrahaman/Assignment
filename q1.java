// Q.1 WAJP to get a number from user and print wheatger the number is positive or negative.


import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("plesae enter a number :");
        int n = sc.nextInt();
        if (n>0) {
            System.out.println("number is positive");
        }
        else if (n<0) {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }
    }
}
