/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bit_Manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class The_Max_Number {
    
    
    private static void check(int[] a, int n, int i) 
    {
        for(int j=0;j<n;j++)
        {
            
        }
    }
    
    public static int no_bits(int no)
    {
        return (int)(Math.log(no) / Math.log(2) + 1);
    }
    
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s1[]=br.readLine().split(" ");
            int n=Integer.parseInt(s1[0]);
            int i=Integer.parseInt(s1[1]);
            String s2[]=br.readLine().split(" ");
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=Integer.parseInt(s2[j]);
            }
            check(a,n,i);
            t--;
        }
        System.out.print(no_bits(t));
    }

    
}
