/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class Deck_Of_Cards {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t>0)
    {
        Queue<Integer> q=new LinkedList();
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            q.add(i+1);
        }
        //int c=0;
        while(q.size()!=1)
        {
            q.remove();
            int a=q.poll();
            q.add(a);
        //    c++;
        }
        //System.out.print("Count="+c);
        System.out.println(q.peek());
        t--;
    }
    }
}
