package com.company.mathematicalpblms;

import java.util.Scanner;

public class OpenDoors {
    static int noOfOpenDoors(Long N) {
        int doorsOpen = (int) Math.sqrt(N);
        return doorsOpen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = sc.nextLong();
        int res = noOfOpenDoors(num);
        System.out.println(res);
    }
}
