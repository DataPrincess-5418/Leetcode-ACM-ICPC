package Kattis.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int[] factors = new int[]{8,16,0,1};
        ArrayList<String> premethod = new ArrayList<>();
        premethod.add(1, "4 + 4");
        premethod.add(2, "4 * 4");
        premethod.add(3, "4 - 4");
        premethod.add(4, "4 / 4");
        Map<Integer, String> Olg = new HashMap<Integer, String>() {};

        for (int i = 0; i < factors.length; ++i) {
            int a = factors[i];
            String b = premethod.get(i);
            Olg.put(a, b);
        }

        ArrayList<Integer> result = new ArrayList<>();

        Scanner scnr = new Scanner(System.in);

        int lengthOfInput = scnr.nextInt();
        int[] input = new int[lengthOfInput];
        for(int i = 0; i < lengthOfInput; ++i) {
            input[i] = scnr.nextInt();
        }

        for (int i = 0; i < factors.length; ++i) {
            int pivot = factors[i];
            for (int j = 0; j < factors.length; ++j) {
                int a = pivot + factors[j];
                result.add(a);
                int b = pivot - factors[j];
                result.add(b);
                int c = pivot * factors[j];
                result.add(c);
                int d = 0;
                if (factors[j] != 0)
                    d = pivot % factors[j];
                else
                    continue;
                result.add(d);
            }
        }

        for (int i = 0; i < input.length; ++i) {
            if (result.contains(input[i]))
                System.out.println(input[i]);
            else
                System.out.println("no solution");
        }

    }
}
