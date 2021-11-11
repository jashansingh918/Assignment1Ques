package Assignments;
//Write a Java program to convert temperature from Fahrenheit to Celsius degree

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        temp = temp - 32;
        float Celsius = 5* temp/9;
        System.out.println("Temp in Celsius: " + Celsius);
    }
    
}
