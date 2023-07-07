package Section7;

import java.util.ArrayList;

public class IceCream {
    private String iceCreamName;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String iceCreamName, int cost, int numScoops) {
        this.iceCreamName = iceCreamName;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }

    public String getIceCreamName() {
        return iceCreamName;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    public void printToppings() {
        for (String topping:
             toppings) {
            System.out.println("\t" + topping);
        }
        System.out.println();
    }

    public void printIceCreamInfo() {
        System.out.println(iceCreamName);
        System.out.println("Cost: $" + cost);
        System.out.println("Topped with:");
        printToppings();
    }
}
