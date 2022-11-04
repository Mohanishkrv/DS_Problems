/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class Queue_using_Stack {
static Stack user=new Stack();
    static Stack func=new Stack();
    public static void main(String[] args)
    {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        System.out.println(user);
        dequeue();
        System.out.println(user);
    }
    public static void enqueue(int data)
    {
        if(user.isEmpty())
            user.push(data);
        else
        {
            while(!user.isEmpty())
            {
                func.push(user.pop());
            }
            user.push(data);
            while(!func.isEmpty())
            {
                user.push(func.pop());
            }
        }
    }
    public static void dequeue()
    {
        user.pop();
    }    
}
