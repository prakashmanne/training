package com.prakash;

public class prime {

    public static void main (String args[]){
        int count=0;
        int n=100;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;

            }
            System.out.println("count is : " + count);
        }
    }
}
