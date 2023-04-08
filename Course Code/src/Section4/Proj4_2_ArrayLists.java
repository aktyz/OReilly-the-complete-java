package Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Double> myAL = new ArrayList<>();
        double userNumber = 1.0;

        while(userNumber > 0.0) {
            System.out.print("Provide real number greater than 0, or -1 to end\t");
            userNumber = s.nextDouble();
            if(userNumber < 0.0) {
                for(int i = myAL.size() -1; i >= 0; i--) {
                    System.out.println(myAL.get(i));
                }
            } else myAL.add(userNumber);
        }
    }
}
