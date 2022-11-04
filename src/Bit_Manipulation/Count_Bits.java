/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bit_Manipulation;

/**
 *
 * @author ASUS
 */
public class Count_Bits 
{
    public static void main(String[] args)
    {
        int n=5;
        int count=0;
        while(n!=0)
        {
            count++;
            n>>=1;
        }
        System.out.println(count);
        //OR
        //System.out.println((int)(Math.log(no) / Math.log(2) + 1));
    }
}
