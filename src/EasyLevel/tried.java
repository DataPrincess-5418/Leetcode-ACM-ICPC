package EasyLevel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class tried {
    public static ArrayList<Point> readFile(Scanner sc) {
        // this method would read the information from 附件1 and add data to Coordinates
        ArrayList<Point> Coordinates = new ArrayList<>();

        try {
            BufferedReader data1 = new BufferedReader(new FileReader("附件1.csv"));
            sc = new Scanner(data1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            Scanner olg = new Scanner(sc.nextLine());
            olg.useDelimiter(",");
            String index = olg.next();
            double x0 = olg.nextDouble();
            double y0 = olg.nextDouble();
            double z0 = olg.nextDouble();

            Point p = new Point(index, x0,y0,z0);

            Coordinates.add(p);
        }

        // close the scanner
        sc.close();

        return Coordinates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Point> a = readFile(sc);
    }
}
