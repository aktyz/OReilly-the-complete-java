public class ArithmeticFun {
    public static void main(String[] args) {
        /*
        * addition operator: +
        * subtraction operator: -
        * multiplication operator: *
        * division operator: /
        * remainder operator: %
        * */

        int a = 10;
        int b = 15;

        int result = a + b; // a and b are operands
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Result is " + result);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);

        // Compound operators:
        result += 20; // result = result + 20

        System.out.println("Result is now " + result);

        result++; //++result
        System.out.println("result++ " + result);
        result--; //--result
        System.out.println("result-- " + result);

        product *= 2;
        System.out.println("Product is now " + product);
    }
}
