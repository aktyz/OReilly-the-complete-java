package Section6;

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println("Multiply the array by 2:");
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] = rand.nextInt(100);
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr : twoDArr) {
            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArr) {
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                int num = twoDArr[i][j];
                twoDArr[i][j] = num * 2;
            }
        }
    }
}
