package Section8;

import java.io.*;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner nums;
        PrintWriter pw;

        try {
            nums = new Scanner(new File("nums.txt"));
            pw = new PrintWriter("twice_nums.txt");
            while(nums.hasNext()) {
                int num = nums.nextInt();
                System.out.println(num);
                pw.println(num * 2);

            }
            nums.close();
            pw.close();
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
