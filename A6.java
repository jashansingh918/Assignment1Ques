package Assignments;
//Write a Java program to find the number of days in a month
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        System.out.println("Enter a month name: ");
        Scanner sc = new Scanner(System.in);
        String month =  sc.next();
        
        if("January".equals(month)){
            System.out.println("Number of days = 31");
        }else if("February".equals(month)){
            System.out.println("Number of days = 28");
        }else if("March".equals(month)){
            System.out.println("Number of days = 31");
        }else if("April".equals(month)){
            System.out.println("Number of days = 30");
        }else if("May".equals(month)){
            System.out.println("Number of days = 31");
        }else if("June".equals(month)){
            System.out.println("Number of days = 30");
        }else if("July".equals(month)){
            System.out.println("Number of days = 31");
        }else if("August".equals(month)){
            System.out.println("Number of days = 31");
        }else if("September".equals(month)){
            System.out.println("Number of days = 30");
        }else if("October".equals(month)){
            System.out.println("Number of days = 31");
        }else if("November".equals(month)){
            System.out.println("Number of days = 30");
        }else if("December".equals(month)){
            System.out.println("Number of days = 31");
        }else{
            System.out.println("Invalid name");
        }
    }
    
}
