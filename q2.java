import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first coefficient : ");
        int a = sc.nextInt();
        System.out.println("please enter the second coefficient : ");
        int b = sc.nextInt();
        System.out.println("please enter the third coefficient : ");
        int c = sc.nextInt();

        double d1 = (b*b -4*a*c);
        double D1 = (Math.sqrt(d1)) - b;
        double d2 = (b*b -4*a*c);
        double D2 = -(Math.sqrt(d2)) - b;

        System.out.println("your root 1st root is = " + D1/2*a);
        System.out.println("your root 1st root is = " + D2/2*a);





    }

}
