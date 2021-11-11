package Assignments;
//Takes a year from user and print whether that year is a leap year or not

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter any year: ");
      int year = sc.nextInt();
      boolean cond = false;
      if(year % 400 == 0)
      {
         cond = true;
      }
      else if(year % 100 == 0)
      {
         cond = false;
      }
      else if(year % 4 == 0)
      {
         cond = true;
      }
      else
      {
         cond = false;
      }
      if(cond)
      {
         System.out.println("Year " + year + " is a Leap Year");
      }
      else
      {
         System.out.println("Year " + year + " is not a Leap Year");
      }
      sc.close();
   }

}

