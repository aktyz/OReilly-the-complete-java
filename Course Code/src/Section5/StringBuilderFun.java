package Section5;

public class StringBuilderFun {
    public static void main(String[] args) {
        String name = "Zyta Slow";
        StringBuilder sb = new StringBuilder(name);
        /** append() method */
        sb.append(" is great tech leader!");
        System.out.println(sb);

        /** insert() method */
        sb.insert(5, "Lucja ");
        System.out.println(sb);

        /** replace() method */
        sb.replace(sb.indexOf("g"), sb.indexOf("t",sb.indexOf("g")) + 1, "amazing");
        System.out.println(sb);

        /** delete() method */
        sb.delete(5, 11);
        System.out.println(sb);

        sb.replace(0, 4, "Ms");
        System.out.println(sb);
    }
}
