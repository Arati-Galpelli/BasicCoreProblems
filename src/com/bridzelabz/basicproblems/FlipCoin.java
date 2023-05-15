package com.bridzelabz.basicproblems;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        double randomnum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to flip the coin :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            randomnum = Math.random();
            if (randomnum < 0.5)
                tail++;
            else
                head++;
        }
        System.out.println("count of head :" + head);
        System.out.println("count of tail :" + tail);
    }
}
