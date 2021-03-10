package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number;
        System.out.println("Enter a Number:");
        number = sc.nextInt();

        if(number % 5 == 0 && number % 3 == 0)
        {
            System.out.println("FizzBuzz");
        }
        else if(number % 5 == 0)
        {
            System.out.println("Fizz");
        }
        else if(number % 3 == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(number);
        }
    }
}
