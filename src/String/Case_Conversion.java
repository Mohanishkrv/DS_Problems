/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Case_Conversion {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0)
        {
            String s=br.readLine();
            String ss="";
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(Character.isLowerCase(c))
                {
                    ss+=c;
                }
                else if(Character.isUpperCase(c) && i==0)
                {
                    ss+=Character.toLowerCase(c);
                }
                else
                {
                    ss+="_"+Character.toLowerCase(c);
                }
            }
            System.out.println(ss);
            t--;
        }
    }
    
}
