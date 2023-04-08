package Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] myAL = new int[5];
        for(int i = 0; i < myAL.length; i++) {
            System.out.print("Enter an integer?\t");
            myAL[i] = s.nextInt();
        }

        for(int i = 0; i < myAL.length; i++) {
            System.out.println("The result is: " + myAL[i] * 2);
        }
    }
}
