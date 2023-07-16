package Section8;

import Section7.Circle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = createCirclesArray();
        PrintWriter pw;

        try {
            pw = new PrintWriter("circle_output.txt");
            for(Circle circle : circles) {
                processCircle(pw, circle);
            }
            pw.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void processCircle(PrintWriter pw, Circle circle) {
        pw.println(circle.returnCircleInfo());
        circle.printCircleInfo();
    }

    private static ArrayList<Circle> createCirclesArray() {
        ArrayList<Circle> circles = new ArrayList<>();
        Scanner sc;
        try {
            sc = new Scanner(new File("circle_input.txt"));
            while(sc.hasNext()) {
                circles.add(new Circle(sc.nextDouble()));
            }
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return circles;
    }
}
