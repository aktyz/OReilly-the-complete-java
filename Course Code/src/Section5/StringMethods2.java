package Section5;

public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Zyta Slow";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int whereIsS = myName.indexOf("S");

        String lastName = myName.substring(5);

        System.out.println("upper is " + upper);
        System.out.println("lower is " + lower);
        System.out.println("S is at index " + whereIsS);
        System.out.println("Last name is " + lastName);
    }
}
