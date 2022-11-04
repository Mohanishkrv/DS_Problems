/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class No_Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(recpali(n));
        System.out.println(pali(n));
    }
    
    
    /*
    private static String pali(int n) 
    {
        int res=0;
        int r=n;
        while(n>0)
        {
            int a=n%10;
            res=res*10+a;
            n=n/10;
        }
        if(res==r)
        {
            return "PALINDROME";
        }
        else
        {
            return "NOT-PALINDROME";
        }
    }*/
    //Using Recursion
    private static String recpali(int n) 
    {
        int res=0;
        int r=n;
        if(r==res)
        {
            return "PALINDROME";
        }
        int a=n%10;
        res=res*10+a;
        n=n/10;
        return recpali(n);
    }
    
}
