package Section4;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int arraySum = 0;
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        for(int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + "\t");
            arraySum += myArray[i];
        }
        System.out.println("\nSum of array elements: " + arraySum);
    }
}
