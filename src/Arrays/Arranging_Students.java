/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Mohanish
 */
public class Arranging_Students {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
            String s11[]=s1.split(" ");
            int a[]=new int[s11.length];
            int al=a.length;
            for(int i=0;i<al;i++)
            {
                a[i]=Integer.parseInt(s11[i]);
            }
        String s2=br.readLine();
        String s22[]=s2.split(" ");
        int b[]=new int[s22.length];         
        int bl=b.length;
            for(int i=0;i<bl;i++)
            {
                b[i]=Integer.parseInt(s22[i]);
            }
            String res=arrange(a,b,al,bl);
            System.out.println(res);
    }
    
    public static String arrange(int[] a,int[] b,int al,int bl)
    {
        int c[]=new int[al+bl];
        System.arraycopy(a, 0,c, 0, al);
        System.arraycopy(b, 0,c,al,bl);
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        boolean bol=false;
        for(int i=0;i<c.length;i+=2)
        {
            if(c[i]==a[i] && c[i+1]==b[i])
            {
                bol=true;
            }
        }
        if(bol=true)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }
     
   
}

