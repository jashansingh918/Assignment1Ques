package Assignments;
//Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;


public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
        
    }
    
}
