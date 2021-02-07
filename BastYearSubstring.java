package com.codeforce;

import java.util.Scanner;

public class BastYearSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test, value, number=0;
        test = scanner.nextInt();
        for (int i =1;i<=test;i++){
            value = scanner.nextInt();
            for (int j =1;j<=value;j++){
                number = scanner.nextInt();
            }
            System.out.println(number);
        }
    }
}
