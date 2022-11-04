/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mohanish
 */
public class Reverse {
    public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t>0)
		{
		    String s=br.readLine();
                    String s1[]=s.split("\\.");
                    int a=s1.length;
                    String ss="";
                    for(int i=a-1;i>=0;i--)//Conmmonn mistake made here
                     //(int i=a-1;i>=0;i--)==>>This results in array IndexOutofBounds
                     //bcoz String array starts from 0 to n-1    
                    {
                        ss=ss+s1[i]+".";
                    }
                    System.out.println(ss.substring(0,ss.length()-1));
		    t--;
		}
	}      
}
