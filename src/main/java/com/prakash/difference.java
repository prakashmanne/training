package com.prakash;

public class difference {
        public static void main(String[] args) {
            int numbers[] = {1, 15, -1, 23, 45, 70, 99, -13, -5};
            int smallest = numbers[0];
            int biggest = numbers[0];
            int difference;

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > biggest)
                    biggest = numbers[i];
                else if (numbers[i] < smallest)
                    smallest = numbers[i];

            }

            System.out.println("Largest Number is : " + biggest);
            System.out.println("Smallest Number is : " + smallest);
            difference = biggest - smallest;
            System.out.println("difference is : " + difference);

        }

}
