package Kattis.java;

import java.util.Scanner;

/**
 * Reverse
 * Input
 * The first line of input contains the integer n. Then comes a list of n integers, each on its own line.
 * Output
 * The list should be printed in reverse order of input.
 */

public class Question1 {



    public static int[] reversed(int len, int[] list){
        int temp = 0;
        int start = 0;
        int end = len - 1;

        while ((end - start) >0) {
            temp = list[start];
            list[start] = list[end];
            list[end] = temp;

            //reduce the index by 1
            end = end -1;
            start = start+1;
        }

        return list;
    }

    public static void main(String[] args) {
        // using the Scanner to get the number in the list and create the list
        Scanner scnr= new Scanner(System.in);
        int numEle = scnr.nextInt();
        int[] a = new int[numEle];

        //get the number
        for(int i = 0; i<a.length;++i){
            int na = scnr.nextInt();
            a[i] = na;
        }

        //using the reversed method to reverse the array
        int[] result = reversed(numEle, a);
        for(int b : result){
            System.out.print(b + " ");
        }
    }
}
