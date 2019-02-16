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
class vec
{
    int a[][] = new int[20][20];
    int i,j,n,k;
    void fun()
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter n");
        n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2;j++)
            {
                k=a[i][j];
                if(a[i][j]==k)
                {
                    for(i=1;i<=n;i++)
                    {
                        for(j=1;j<=2;j++)
                        {
                            
                        }
                    }
                }
            }
        }
    }
}
public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
