package Section6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the number of elements for the array:\t");
        ArrayList<Integer> myArr = fillArray(sc.nextInt());
        sc.nextLine();
        printArray(myArr);
        System.out.print("Sum of your array elements:\t");
        System.out.println(sumElements(myArr));
    }

    public static int sumElements(ArrayList<Integer> numbers) {
        int sum = 0;
        for(int num : numbers) sum += num;
        return sum;
    }

    public static ArrayList<Integer> fillArray(int arraySize) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arraySize; i++)
            arr.add(i, rand.nextInt(100));
        return arr;
    }

    public static void printArray(ArrayList<Integer> arr) {
        for(int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
