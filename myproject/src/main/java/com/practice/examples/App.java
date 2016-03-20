package com.practice.examples;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 App app = new App();
    	 app.testMethod();

    }
    
    public void testMethod(){
    	
    	
    }
    
    
    public static boolean CheckParentesis(String str)
    {
        if (str.isEmpty())
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '[')
            {
                stack.push(current);
            }


            if (current == '}' || current == ')' || current == ']')
            {
                if (stack.isEmpty())
                    return false;

                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else 
                    return false;
            }

        }

        return stack.isEmpty();
    }
    
    static void StairCase(int n) {   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
             }
            for(int j=n-i+1;j<=n;j++){
                 System.out.print("# ");
             }
             System.out.println();
        }
     }

}
