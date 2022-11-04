/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class perm_size_of_Array {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        int r=Integer.parseInt(br.readLine());
        printPerm(n,r,a);
    }

    private static void printPerm(int n, int r, int[] a) 
    {
        int res[]=new int[r];
        getPerm(a,n,r,0,res,0);
    }

    private static void getPerm(int[] a, int n, int r, int index, int[] res, int i) 
    {
        if(index==r)//when index reaches r i.e size of subset
        {
            System.out.print("Result :- ");
            System.out.println(Arrays.toString(res)); 
            System.out.println(""); 
            return;
        }
        
        //When main array reaches end
        if(i>=n)
            return;
        
        res[index]=a[i];//assign first value to the resultant array
        System.out.println("First Backtrack index+1 & i+1"+Arrays.toString(res));
        getPerm(a, n, r, index+1, res, i+1);
        
        System.out.println("Second Backtrack index & i+1"+Arrays.toString(res));
        getPerm(a, n, r, index, res, i+1); 
    }
}
