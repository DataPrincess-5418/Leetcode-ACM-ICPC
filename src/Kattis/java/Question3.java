package Kattis.java;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // number of questions and rated judges
        int n = scnr.nextInt();
        int k = scnr.nextInt();
        int remK = n - k;
        int[] rates = new int[k];

        int total = 0;

        for (int i = 0; i < k; ++i) {
            rates[i] = scnr.nextInt();
            total = total + rates[i];
        }


        double max = (((double) total) + remK * 3) / n;
        double min = (((double) total) - remK * 3) / n;

        System.out.println(min + " " + max);
    }
}
