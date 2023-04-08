package Section4;

public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray; // declaration of an Array is similar to the declaration
        // of any other variable type, only adding '[]' after the data type
        /*
        * Even though the array elements are integers - therefore primitives,
        * the array itself is always a reference type: it's name holds the address
        * of the first byte of the array
        * */
        myArray = new int[5];
        /* You can create an array at runtime from user variable or a function
        * However once an array is created you cannot modify it's size anymore
        * */
        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }
        /* Enhanced syntax for loop - for data collections */
        //for (int i : myArray) System.out.println(myArray[i]); <- the syntax pulls the content, not the index
        for (int i :
                myArray) {
            System.out.println(i);
        }
    }
}
