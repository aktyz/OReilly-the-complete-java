package Section6;

import java.util.Random;
import java.util.Scanner;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the number of elements for the array:\t");
        int[] myArr = new int[sc.nextInt()];
        fillArray(myArr);
        printArray(myArr);
        System.out.print("Sum of your array elements:\t");
        System.out.println(sumElements(myArr));
    }// end of main

    public static int sumElements(int[] numbers) {
        int sum = 0;
        for(int num : numbers) sum += num;
        return sum;
    }

    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    public static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
