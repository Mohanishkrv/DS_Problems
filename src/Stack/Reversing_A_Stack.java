/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Reversing_A_Stack {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().trim().split(" ");
        String temp=s[s.length-1];
        s[s.length-1]=temp.substring(0,temp.length()-1);
        Stack<String> stk=new Stack();
        Stack<String> stk2=new Stack();
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("input:") || s[i].equals("input"))
            {
                continue;
            }
            else
            {
                stk.add(s[i]);
            }
        }
        
        for(int i=0;i<s.length-1;i++)
        {
            String ss=stk.pop();
            stk2.add(ss);
        }
        //System.out.print(stk2);
        System.out.print("output: ");
        String res="";
        for(int i=0;i<s.length-1;i++)
        {
            res=res+" "+stk2.pop();
        }
        res=res.substring(1,res.length());
        System.out.print(res);
        System.out.print(".");
    }
}