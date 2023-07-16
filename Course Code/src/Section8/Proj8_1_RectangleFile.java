package Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = createRectanglesArray();
        for(int i = 0; i < rectangles.size(); i++) {
            printRectangleInfo(i + 1, rectangles.get(i));
        }
    }

    public static ArrayList<Rectangle> createRectanglesArray() {
        Scanner sc;
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        try {
            sc = new Scanner(new File("rectangle_data.txt"));

            while(sc.hasNext()) {
                rectangles.add(new Rectangle(sc.nextDouble(), sc.nextDouble()));
            }

            sc.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return rectangles;
    }

    public static void printRectangleInfo(int index, Rectangle rectangle) {
        System.out.println("Rectangle " + index + " info:");
        System.out.print("\tLength:\t" + rectangle.getLength());
        System.out.print("\tWidth:\t" + rectangle.getWidth());
        System.out.print("\tArea:\t" + rectangle.area());
        System.out.print("\tPerimeter:\t" + rectangle.perimeter());
        System.out.println();
        System.out.println();
    }
}
