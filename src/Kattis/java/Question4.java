package Kattis.java;

import java.util.Scanner;

public class Question4 {
        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int arrowBaseHeight;
            int arrowBaseWidth;
            int arrowHeadWidth;
            int i;
            int j;
            int a;
            int b;

            System.out.println("Enter arrow base height:");
            arrowBaseHeight = scnr.nextInt();

            System.out.println("Enter arrow base width:");
            arrowBaseWidth = scnr.nextInt();

            System.out.println("Enter arrow head width:");
            arrowHeadWidth = scnr.nextInt();

            while(arrowHeadWidth <= arrowBaseWidth){
                System.out.println("Enter arrow head width:");
                arrowHeadWidth = scnr.nextInt();
            }
            System.out.println("");

            for(i=0;i<arrowBaseHeight; i++){
                for(j=0; j<arrowBaseWidth; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }

            for(a=0; a<arrowHeadWidth; a++){
                for(b=arrowHeadWidth; b>a; b--){
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

}
