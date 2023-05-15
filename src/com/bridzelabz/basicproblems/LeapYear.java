package com.bridzelabz.basicproblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        while(year!=0){
            year=year/10;
            count++;
        }
        if(count==4){
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Entered year is leap year");
            else
                System.out.println("Entered year is not leap year");
        }
        else
            System.out.println("Invalid year");

    }
}
