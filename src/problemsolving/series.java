/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class ser
{
 int n,i,k=7;
 void fun()
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter n");
     n = in.nextInt();
     //System.out.println(k);
     for(i=1;i<=n-1;i++)
     {
         k=k*2+i;
         
     }
         System.out.println(k);    
 }
}
public class series {
    public static void main(String args[])
    {
        ser s =new ser();
        s.fun();
    }
}
