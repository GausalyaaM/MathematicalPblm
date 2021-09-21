package com.company.mathematicalpblms;
import java.util.Scanner;
public class BalanceNumber {
    public static Boolean balancedNumber(String N)
    {
        int len=N.length();
        boolean bool=false;
        int sum1=0,sum2=0;
        for(int i=0;i<len;i++){
            if(i<(len/2)){
                sum1+=(N.charAt(i)-48);}
            else if(i>(len/2))
            {
                sum2+=(N.charAt(i)-48);
            }
        }
        if(sum1==sum2){
            bool=true;
        }
        return bool;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.next();
        boolean value=balancedNumber(input);
        if(value){
        System.out.println("1");}
        else{
            System.out.println("0");
        }
    }
}
