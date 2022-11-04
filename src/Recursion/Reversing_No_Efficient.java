/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */  
public class Reversing_No_Efficient {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.print(rev(n));
}

    private static int rev(int n) 
    {
        if(n==0)
            return 0;
        return (int) (n%10 * Math.pow(101,(int)Math.log10(n)) + rev(n/10));
    }
}
