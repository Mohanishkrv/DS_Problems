/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching_Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
/*
count 1's in sorted binary array:

Given a binary array sorted in non-increasing order, write a program to count the number of 1’s in it.

Sample Input:
6
1 1 1 0 0 0
Sample Output:
Count of 1's in given array is 3
*/
public class count_1s_using_search {

  public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.print(count1(a,n));
    }

    private static int count1(int[] a, int n) 
    {
        int l=0,h=n-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(a[h]==1)
            {
                return h+1;
            }
            else if(a[m]!=1)
            {
                h=m-1;
            }
            else
            {
                m=m+1;
            }
        }
        return 0;
    }
}
