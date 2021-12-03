package EasyLevel;

import java.util.Scanner;

public class test_t {
    public static void main (String[] args){
        Scanner sc = new Scanner(System. in);

        double x;
        double y;
        double z;

        double k;

        double x1;
        double y1;
        double z1;

        double d;
        double sum=0;
        double compare [] = new double[13];
        int index = 0;

        Double xy [][] = new Double[601][99999];
        Double seq [] = new Double[99999];
        int q = 0;
        //System.out.println(sum);

        int times=0;

        for(double t=-0.6; t<0.7;t=t+0.1) {
            for (int i = -300; i < 300; i=i+100) {
                for (double j = -Math.sqrt(90000 - Math.pow(i, 2)); j < Math.sqrt(90000 - Math.pow(i, 2)); j=j+100) {
                    z = Math.sqrt(90000 - Math.pow(i, 2) - Math.pow(j, 2));
                    k = (4 * z * (139.8+t)) / (Math.pow(i, 2) + Math.pow(j, 2));
                    x1 = i*k;
                    y1 = j*k;
                    z1 = z*k;
                    //k = Math.sqrt(559.2-1.864*t+Math.pow((0.932*z)/(Math.pow(i,2)+Math.pow(j,2)),2))+(0.932*z/(Math.pow(i,2)+Math.pow(j,2)));
                    /*x1 = Math.sqrt((90000 - Math.pow(j, 2) - Math.pow(z, 2))) * k;
                    y1 = Math.sqrt((90000 - Math.pow(i, 2) - Math.pow(z, 2))) * k;
                    z1 = Math.sqrt((90000 - Math.pow(i, 2) - Math.pow(j, 2))) * k;
                     */
                    d = Math.sqrt(Math.pow(x1 - (i), 2) + Math.pow(y1 - (j), 2) + Math.pow(z1 - (z), 2));
                    sum = sum + d;

                    System.out.println(k);

                }
            }
            compare[index] = sum;
            //System.out.println(compare[index]);
            index++;
            sum = 0;

        }
        System.out.println(compare[7]);

        /*
        for(double t=-0.6; t<0.7;t=t+0.1) {
            for (int i = 0; i < 600; i=i+10) {
                for (double j = -Math.sqrt(90000-Math.pow(i-300,2)); j < Math.sqrt(90000-Math.pow(i-300,2)); j=j+10) {
                    k = (4 * xy[i][(int)j] * (139.8 + t)) / ((Math.pow(i - 300, 2) + Math.pow(j, 2)));
                    x1 = Math.sqrt((90000 - Math.pow(j, 2) - Math.pow(xy[i][(int)j], 2))) * k;
                    y1 = Math.sqrt((90000 - Math.pow(i - 300, 2) - Math.pow(xy[i][(int)j], 2))) * k;
                    z1 = Math.sqrt((90000 - Math.pow(i - 300, 2) - Math.pow(j, 2))) * k;
                    d = Math.sqrt(Math.pow(x1 - (i - 300), 2) + Math.pow(y1 - (j), 2) + Math.pow(z1 - (xy[i][(int)j]), 2));
                    sum = sum + d;
                }
            }
            compare[index] = sum;
            System.out.println(sum);
            sum = 0;
        }
        */


        double min = 999999999;

        for(int i=0; i<13; i++){
            if(compare[i]<min){
                min = compare[i];
                index = i;
            }
        }

        System.out.print(-0.6+(index)/10);
    }
}
