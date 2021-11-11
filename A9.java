package Assignments;
//Take a input from user and print a number triangle

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
