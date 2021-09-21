package com.company.mathematicalpblms;
import java.util.Scanner;
public class PalindromeNumber {
    public static long isPalindrome(long N){
        long[] arr=new long[100];
        int k=0;
        long output=0;
        while(N>0){
            arr[k]=arr[k]*10+(N%2);
            N/=2;
            k++;
        }
        for(int i=0,j=k-1;i<=j;i++,j--){
            if(arr[i]!=arr[j]){
                return output;
            }
        }
        output=1;
        return output;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        long num=sc.nextLong();
        long res=isPalindrome(num);
        System.out.println(res);
    }
}
