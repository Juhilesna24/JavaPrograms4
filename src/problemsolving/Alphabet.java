/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolving;

import java.io.*;
import java.util.*;
public class Alphabet {
    public static void main(String  args[])
    {
        char c[]={'a','b','c','d','e','f','g','h','i','j'};
        int i,store=0,j,n,l,r,count=0;
     
        Scanner o=new Scanner(System.in);
        System.out.println("\n Enter the  number");
        n=o.nextInt();
        int temp=n;
        while(n!=0)
        {
            r=n%10;
            store=store+r;
            count=count+1;
            n=n/10;
        }
        char ch[]=new char[count];
        i=0;
        while(temp!=0)
        {
            r=temp%10;
            ch[i]=c[r];
            i++;
            temp=temp/10;
            System.out.println(ch[i]);
        }
    }
}
