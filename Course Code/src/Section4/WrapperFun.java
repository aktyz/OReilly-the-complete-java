package Section4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myIntArrayList = new ArrayList<>();
        /* As for the Wrapper Classes Java automatically boxes them
        * into the primitive types, we don't need to provide
        * 'new Integer(5)' but only '5' inside .add function */
        myIntArrayList.add(5);
        myIntArrayList.add(22);

        for (int integer :
                myIntArrayList) {
            System.out.print(integer + "\t");
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;
        System.out.print(numericValue + "\t");

        String piApproximation = "3.14159";
        double pi = Double.parseDouble(piApproximation);
        System.out.print(pi + "\t");
    }
}
