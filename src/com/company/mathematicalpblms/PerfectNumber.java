package com.company.mathematicalpblms;

import java.util.Scanner;

public class PerfectNumber {
    static int isPerfectNumber(Long N) {
        long sum = 0;
        int output = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if (sum == N) {
            output = 1;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long num = sc.nextLong();
        int res = isPerfectNumber(num);
        System.out.println(res);
    }
}
