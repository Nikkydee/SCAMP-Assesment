package chapter4;

import java.util.Scanner;

public class Fibonacci {

        public static void fibonacci(int fib1, int fib2) {
            int fibonum1=fib1;
            int fibonum2=fib2;
            int fibosequence;
            int count=10;
            System.out.print(fibonum1+" "+fibonum2);//printing 0 and 1

            for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                fibosequence=fibonum1+fibonum2;
                System.out.print(" "+fibosequence);
                fibonum1=fibonum2;
                fibonum2=fibosequence;
            }

        }

        public static void main(String[] args) {
            fibonacci(0,1);

        }


    }