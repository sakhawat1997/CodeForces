package com.codeforce;

import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b, sum , sumage,count=0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        for (;;){
            a *= 3;
            b *= 2;
            count++;
            if (a>b)
                break;
        }
        System.out.println(count);
    }
}
