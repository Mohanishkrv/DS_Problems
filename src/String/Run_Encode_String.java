package String;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Run_Encode_String {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        check(s);
    }

    public static void check(String str) 
    { 
        int n = str.length(); 
        for (int i = 0; i < n; i++) 
        { 
            int count = 1; 
            while (i < n - 1 &&str.charAt(i) == str.charAt(i + 1)) 
            { 
                count++; 
                i++; 
            } 
            System.out.print(str.charAt(i)); 
            System.out.print(count); 
        } 
    } 
}