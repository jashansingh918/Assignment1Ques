package Assignments;
//Take input 5 numbers from keyboard and find their sum and average
import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        
        int sum = num1+num2+num3+num4+num5;
        System.out.println("Sum: " + sum );
        System.out.println("Average: " + sum/5);
        
        
    }
    
}
