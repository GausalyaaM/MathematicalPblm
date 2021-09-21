package com.company.mathematicalpblms;
import java.util.Scanner;
public class LuckyNumber {
    static int counter=2;
    public static boolean isLucky(int n){
        if(counter>n)
            return true;
        if(n%counter==0)
            return false;
        int next_pos=n-(n/counter);
        counter++;
        return isLucky(next_pos);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean val=isLucky(num);
        if(val) {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
