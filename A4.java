package Assignments;
//Take a number from the user and generate an integer between 1 and 7 and display the name of the weekday.

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        
        switch (day) {
          case 1 -> System.out.println("Monday");
          case 2 -> System.out.println("Tuesday");
          case 3 -> System.out.println("Wednesday");
          case 4 -> System.out.println("Thursday");
          case 5 -> System.out.println("Friday");
          case 6 -> System.out.println("Saturday");
          case 7 -> System.out.println("Sunday");
        }
        
    }
    
}
