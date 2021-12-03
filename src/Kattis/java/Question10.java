package Kattis.java;

import java.util.Scanner;
import java.util.Arrays;


public class Question10 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numCases = scnr.nextInt();
        int[] v1 = null;
        int[] v2 = null;

        for (int i = 0; i < numCases; ++i) {
            int length = scnr.nextInt();
            v1 = new int[length];
            v2 = new int[length];
            for (int j = 0; j < length; ++j) {
                v1[j] = scnr.nextInt();
            }
            for (int w = 0; w < length; ++w) {
                v2[w] = scnr.nextInt();
            }

            Arrays.sort(v1);
            Arrays.sort(v2);

            int Y = 0;
            for (int z = 0; z < v1.length; ++z) {
                int a = z;
                int b = length - z - 1;

                if (b >= 0) {
                    Y = Y + v1[a]*v2[b];
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + Y);
        }

    }
}
