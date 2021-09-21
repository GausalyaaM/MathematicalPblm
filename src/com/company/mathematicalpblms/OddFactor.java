package com.company.mathematicalpblms;
import java.util.Scanner;
public class OddFactor {
    static long count(int N) {
        long oddFactor = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                oddFactor++;
            }
        }
        return oddFactor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        long res = count(num);
        System.out.println(res);
    }
}
