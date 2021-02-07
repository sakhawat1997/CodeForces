package com.codeforce;

import java.util.Scanner;

public class AntoDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = scanner.next();
        int Acount = 0;
        int Dcount = 0;
        for (int i =0;i<word.length();i++){
            if (word.charAt(i)=='A')
                Acount++;
            else
                Dcount++;
        }
        if (Acount>Dcount)
            System.out.println("Anton");
        else if (Acount<Dcount)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
}
