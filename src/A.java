/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author my pc
 */
import java.util.*;
public class A
{
    Scanner s1=new Scanner(System.in);
    String st,st1,st2="";
    char a[]=new char[50];
    void dis()
    {
        st=s1.next();
        a=st.toCharArray();
        st1=String.copyValueOf(a);
        for(int i=0;i<7;i++)
        {
            st2+=st1;
        }
       // st2=st1.Stringutils.repeat(st1,7);
       System.out.println(st2);
    }
    public static void main(String args[])
    {
      A aa=new A();
      aa.dis();
    }
}
