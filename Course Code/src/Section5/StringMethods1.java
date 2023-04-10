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
        if(name.compareTo(otherName) > 0) {
            System.out.println(name + " > " + otherName);
        } else {
            System.out.println(name + " <= " + otherName);
        }

        if(myName.compareTo(name) > 0) {
            System.out.println(myName + " > " + name);
        } else {
            System.out.println(myName + " <= " + name);
        }
    }
}
