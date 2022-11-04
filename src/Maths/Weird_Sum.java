/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Weird_Sum {
    public static void main(String[] args) throws  Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s1[]=br.readLine().split(" ");
        int N=Integer.parseInt(br.readLine());
        int K=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        
        String s2[]=br.readLine().split(" ");
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=Integer.parseInt(s2[i]);
        }
        
        getSum(N,K,M,a);
    }
    
    public static int getSum(int N,int K,int M,int[] a)
    {
        int sum=0;
        
        return sum;
    }
}
