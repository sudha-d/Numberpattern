package com.company;

import java.util.Scanner;

public class Number55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n value ");

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i+n; j++) {
                System.out.print(j +" ");

            }
            System.out.println("");
        }
    }
}

