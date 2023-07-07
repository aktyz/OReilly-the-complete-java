package Section7;

public class Proj7_2_IceCreamDemo {
    public static void main(String[] args) {
        IceCream ice1 = new IceCream("Chocolate", 3, 2);
        IceCream ice2 = new IceCream("Strawberry", 2, 1);

        ice1.addTopping("nuts");
        ice1.addTopping("cherries");
        ice2.addTopping("sprinkles");

        ice1.printIceCreamInfo();
        ice2.printIceCreamInfo();
    }
}
