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
public class Longest_Valid_Substring {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int max=0;
            String s=br.readLine();
            Stack<Integer> stk=new Stack<Integer>();
            stk.push(-1);
            for(int i=0;i<s.length();i++)
            {
                int c=s.charAt(i);
                if(c=='(')
                {
                    stk.push(i);
                }
                else
                {
                    stk.pop();
                    if(!stk.isEmpty())
                    {
                        int x=i-stk.peek();
                        max=Math.max(max,x);
                    }
                    else
                    {
                        stk.push(i);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
