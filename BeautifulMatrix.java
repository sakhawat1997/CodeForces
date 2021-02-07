package com.codeforce;

import java.util.Scanner;
import static java.lang.Math.abs;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=0,y=0,ans;
        int [][] matrix = new int[5][5];
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(matrix[i][j]==1){
                    x=i+1;
                    y=j+1;
                }
            }
        }
        ans= abs(x-3)+abs(y-3);
        System.out.printf("%d\n",ans);
    }
}
