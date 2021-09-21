package com.company.mathematicalpblms;
import java.util.Scanner;
public class Sqrt {
    public static long floorSqrt(long x){
        if (x == 0 || x == 1){
            return x;
        }
        long i = 1, result = 1;
        while (result <= x) {
            i++;
            result = i * i;
        }
        return i-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long num=sc.nextLong();
        long result=floorSqrt(num);
        System.out.println("Square root of a given number is:"+result);
    }
}
