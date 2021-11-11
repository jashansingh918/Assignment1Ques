package Assignments;
//Take an positive integer and count the number of digits the number has and print the result eg. Input 100  output 3 

import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = Integer.toString(num);
        int digits = s.length();
        System.out.println("Number of Digits: " + digits);
    }   
}
