package Kattis.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Question11 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        ArrayList<point> blackpoints = new ArrayList<>();
        ArrayList<point> whitepoints = new ArrayList<>();

        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                point ads = new point(i, j);
                if ((i + j)%2 == 0)
                    blackpoints.add(ads);
                else
                    whitepoints.add(ads);
            }
        }

        ArrayList<point> blackpoints = new ArrayList<>();
        ArrayList<point> whitepoints = new ArrayList<>();
        A4 -->(1,4) --> (1+4, 1-4)
        B2 --> (2, 2) -->(2+2, 2-2)
        (1+4,  有没有0)
        (找有没有2+2,0)


        ArrayList<point> startps = new ArrayList<>();
        ArrayList<point> endps = new ArrayList<>();

        int numcases = scnr.nextInt();
        for (int i = 0; i < numcases; ++i) {
            String xpos = scnr.next();
            int xaxis = 0;
            switch (xpos) {
                case "A":
                    xaxis = 1;
                case "B":
                    xaxis = 2;
                case "C":
                    xaxis = 3;
                case "D":
                    xaxis = 4;
                case "E":
                    xaxis = 5;
                    break;
                case "F":
                    xaxis = 6;
                    break;
                case "G":
                    xaxis = 7;
                    break;
                case "H":
                    xaxis = 8;
            }
            int ypos = scnr.nextInt();
            point start = new point(xaxis, ypos);
            startps.add(start);

            String xposend = scnr.next();
            switch (xposend) {
                case "A":
                    xaxis = 1;
                case "B":
                    xaxis = 2;
                case "C":
                    xaxis = 3;
                case "D":
                    xaxis = 4;
                case "E":
                    xaxis = 5;
                    break;
                case "F":
                    xaxis = 6;
                    break;
                case "G":
                    xaxis = 7;
                    break;
                case "H":
                    xaxis = 8;
            }
            int yposend = scnr.nextInt();
            point end = new point(xaxis, yposend);
            endps.add(end);
        }




    }
    public static class point {
        int a = 0;
        int b = 0;

        public point(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA(){
            return this.a;
        }
        public int getB(){
            return this.b;
        }
    }
}
