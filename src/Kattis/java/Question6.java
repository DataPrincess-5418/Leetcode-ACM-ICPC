package Kattis.java;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner lbwnb = new Scanner(System.in);
        String input = lbwnb.next();
        int size = input.length();
        int[] nums = new int[size];
        for (int i = 0; i < size; ++i) {
            nums[i] = (int)input.charAt(i) - 48;
        }

        int p1 = nums[0];
        int p2 = nums[0];
        int difference = 0;
        int result = p1 -1;
        for (int i = 0; i < size - 1; ++i) {
            p1 = nums[i];
            p2 = nums[i + 1];

            difference = Math.abs(p2 - p1);
            result = difference + result;

        }

        System.out.print(result);

    }
}
