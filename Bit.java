package com.codeforce;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value,x=0;
        value = scanner.nextInt();
        String operator [] = new String[value+1];
        for (int i=1;i<=value;i++){
            operator[i] = scanner.next();
            if (operator[i].equals("++X")){
                ++x;
            }
            if (operator[i].equals("X++")){
                x++;
            }
            if (operator[i].equals("X--")){
                x--;
            }
            if (operator[i].equals("--X")){
                --x;
            }
        }
        System.out.println(x);
    }
}