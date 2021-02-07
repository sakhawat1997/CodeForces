package com.codeforce;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sendAmount,totalAmount =0,dueAmount,counter=0,totalMal,totalBill,MalRate;
        System.out.print("Total Amount: ");
        totalMal = scanner.nextInt();
        System.out.print("Price: ");
        MalRate = scanner.nextInt();
        totalBill = (totalMal * MalRate) -1000;
        while (true){
            System.out.print("Send Amount: ");
            sendAmount = scanner.nextInt();
            counter++;
            totalAmount +=sendAmount;
            dueAmount = totalBill - totalAmount;
            System.out.println("Total Receive: "+totalAmount);
            if (dueAmount==0){
                System.out.println("Due Complete!");
            }
            System.out.println("Total Due: "+dueAmount);
            System.out.println("Total Bill: "+counter);
            if (dueAmount<=0)
                break;
            if (totalAmount>=totalBill)
                break;
        }
    }
}
