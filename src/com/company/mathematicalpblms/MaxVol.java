package com.company.mathematicalpblms;

import java.util.Scanner;

public class MaxVol {
    static long getVol(int A, int B) {
        long l = (long) (A - Math.sqrt(A * A - 24 * B)) / 12;
        long v = (long) (l * (B / 2 - l * (A / 4 - l)));
        //long v =(long)(36*A*B-A*A*A+(Math.sqrt((A*A-24*B)*(A*A-24*B)*(A*A-24*B))))/(12*72);
        return v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int A = sc.nextInt();
        System.out.println("Enter the value of B:");
        int B = sc.nextInt();
        long res = getVol(A, B);
        System.out.println(res);
    }
}