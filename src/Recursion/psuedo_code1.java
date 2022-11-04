/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author ASUS
 */
public class psuedo_code1 {
    static int n=40,limit=1000;
    public static void main(String[] args)
    {
        System.out.print(fun(n));
    }
    
    public static int fun(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        if(n>limit)
        {
            return 2;
        }
        System.out.print(n);
        fun(2*n);
        System.out.print(n);
        return 0;
    }
    
}
