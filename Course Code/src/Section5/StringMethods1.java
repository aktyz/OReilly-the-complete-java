package Section5;

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Anna Kowalski";
        String sameName = "Anna Kowalski";
        String otherName = "Rob Perceval";
        String myName = "Zyta Slow";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "\t");
        }
        System.out.println();

        if(name.equals(sameName)) {
            System.out.println("Names are equal");
        } else {
            System.out.println("Names are not equal");
        }
        System.out.println();
        System.out.println("String.compareTo compares two strings lexicographically:");
        System.out.println("The result is a positive integer if this String object lexicographically follows the argument string.");
        if(name.compareTo(otherName) > 0) {
            System.out.println(name + " <= " + otherName);
        } else {
            System.out.println(name + " > " + otherName);
        }

        if(name.compareTo(myName) > 0) {
            System.out.println(name + " <= " + myName);
        } else {
            System.out.println(name + " > " + myName);
        }

        if(myName.compareTo(otherName) > 0) {
            System.out.println(myName + " <= " + otherName);
        } else {
            System.out.println(myName + " < " + otherName);
        }
    }
}
