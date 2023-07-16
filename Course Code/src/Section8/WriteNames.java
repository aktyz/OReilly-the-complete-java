package Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Milenka");
        names.add("Włodek");
        names.add("Zytka");
        names.add("Staś");
        names.add("Zuzia");
        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for(String name : names) {
                pw.println(name);
            }
            pw.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
