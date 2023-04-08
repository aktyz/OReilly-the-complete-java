package Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> myAL = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter an integer?\t");
            myAL.add(s.nextInt());
        }

        for(int i = 0; i < myAL.size(); i++) {
            System.out.println("The result is: " + myAL.get(i) * 2);
        }
    }
}
