/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.Scanner;

/**
 *
 * @author Mohanish
 */
public class Manipulations_req_to_make_Anagram 
{
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for(int i = 0; i < test; i++)
    {
    String a = sc.next();
    String b = sc.next();
    char ch[] = a.toCharArray();
    char ch1[] = b.toCharArray();
    int comman = 0;
    for(int j = 0; j < ch1.length; j++)
    {
        for(int k = 0; k < ch.length; k++)
        {
            if(ch1[j] == ch[k])
            {
                comman++;
                ch[k] = '0';
                break;
            }
        }
    }
    comman = comman * 2;
    int length = ch1.length + ch.length - comman;
    System.out.println(length);
    }
}    
}
