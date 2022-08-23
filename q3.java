// Q3. take three numbers from user and print the gratest number.

import java.util.*;
public class q3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("please enter your first number : ");
      int a = sc.nextInt();
      System.out.println("please enter your second number : ");
      int b = sc.nextInt();
      System.out.println("please enter your third number : ");
      int c = sc.nextInt();

      if (a>b && a>c) {
        System.out.println(a + " is greatest");
      }
      else if (b>c && b>a) {
        System.out.println(b + " is greatest");
      }
      else {
        System.out.println(c + " is greatest");
      }

    }
}
