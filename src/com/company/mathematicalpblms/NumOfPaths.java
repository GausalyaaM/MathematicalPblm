package com.company.mathematicalpblms;
import java.util.Scanner;
public class NumOfPaths {
    public static int numberOfPaths(int m, int n) {
        int[][] count=new int[m][n];
        for(int i=0;i<m;i++){
            count[i][0]=1;
        }
        for(int j=0;j<n;j++){
            count[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                count[i][j]=count[i-1][j]+count[i][j-1];
            }
        }
        return count[m-1][n-1];
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=scan.nextInt();
        System.out.println("Enter the number of columns:");
        int col=scan.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        int res=numberOfPaths(row,col);
        System.out.println(res);
    }
}
