public class ConversionFun {
    public static void main(String[] args) {
        // WHOLE NUMBERS TYPES
        byte myByte = 127; // one byte of memory
        short myShort = 32767; // short data type holds 2 bytes of memory
        int myInteger = 2147483647; // int data type holds 4 bytes of memory FOR WHOLE NUMBERS
        long myLong = 55; // long data type holds 8 bytes of memory FOR WHOLE NUMBERS

        // FLOATING POINT TYPES
        float myFloat = 3.14F; // float data type holds 4 bytes of memory FOR FLOATING POINT
        //float myFloat = 3.14; // narrowing/lossy conversion
        double myDouble = 3.14; // double data type holds double times float = 8 bytes of memory FOR FLOATING POINT
        double yourDouble = myFloat; // widening/lossless conversion

        // SPECIAL PRIMITIVE TYPES
        char myChar = 'm'; // storing one character
        boolean myTrueBoolean = true; // storing true or false
    }//end main
}
