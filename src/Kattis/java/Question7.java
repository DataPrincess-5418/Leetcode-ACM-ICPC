package Kattis.java;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (scnr.hasNextLine()) {
            String[] nums = scnr.nextLine().split(" ");
            int j = 0;
                // the mosquito
                int M = Integer.parseInt(nums[j]);
                // the pupa
                int P = Integer.parseInt(nums[j + 1]);
                // the larva
                int L = Integer.parseInt(nums[j + 2]);
                // the egg lay by a single mosquito
                int E = Integer.parseInt(nums[j + 3]);
                // the rate of death from larva to pupa
                int R = Integer.parseInt(nums[j + 4]);
                // the rate of death from pupa to mosquito
                int S = Integer.parseInt(nums[j + 5]);
                // the weeks
                int N = Integer.parseInt(nums[j + 6]);

                // previous day of mosquito
                int M0 = 0;
                for (int i = 0; i < N; ++i) {
                    M0 = M;
                    M = P / S;
                    P = L / R;
                    L = E * M0;
                }

                System.out.println(M);
            }

    }
}

