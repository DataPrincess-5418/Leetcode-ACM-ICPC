package Kattis.java;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner lbwnb = new Scanner(System.in);
        int size = lbwnb.nextInt();
        int[] cards = new int[size];
        for (int i = 0; i < size; ++i) {
            cards[i] = lbwnb.nextInt();
        }

        Arrays.sort(cards);

        int p1 = cards[0];
        int p2 = cards[0];
        int result = cards[0];

        for (int i = 0; i < size - 1; ++i) {

            p1 = cards[i];
            p2 = cards[i+1];

            if ((p2 - p1) == 1) {
                continue;
            }
            result = result + p2;

        }

        System.out.print(result);

    }
}
