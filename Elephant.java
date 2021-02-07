package com.codeforce;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count =0, sum =0;
        n = scanner.nextInt();
        for (;;){
            sum = sum + 5;
            count++;
            if (sum>=n)
                break;
        }
        System.out.println(count);
    }
}
