package com.prakash;

public class findingnumber {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5, 6};
        double avg;
        double sum = 0;
        for (int i = 0; i<a.length; i++) {
            sum = sum+a[i];


        }
        avg = sum/ a.length;
        System.out.println("avg is : " + avg);

    }
}


