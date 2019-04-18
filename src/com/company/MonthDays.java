package com.company;

import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int numDays;

        System.out.print("How many days in your month: ");
        numDays = sc.nextInt();
        sc.nextLine();

        switch (numDays) {

            case 31:
            System.out.println("January, March, May, July, August, October, December" );
            break;
            case 28:
            System.out.println("February");
            break;
            case 29:
            System.out.println("February");
            break;
            case 30:
            System.out.println("April, June, September, November");
            break;
            default:
                System.out.println("There are no months with that number of days");


        }

    }
}
