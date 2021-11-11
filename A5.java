package Assignments;
//Take two floating-point numbers and test whether they are the same up to three decimal places.
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
//        if(num1==num2)
//        {
//            System.out.println("Same");
//        }else{
//            System.out.println("Not same");
//        }
        float x = Math.round(num1*1000);
        x = x/1000;
        System.out.println(x);
        float y = Math.round(num2*1000);
        y = y/1000;
        System.out.println(y);
        if(x==y){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }
    }
    
}
