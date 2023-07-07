package Section7;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House(2, 6, "red");
        House yourHouse = new House();

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("blue");

        System.out.println("My house data:");
        printHouseData(myHouse);
        System.out.println("Your house data:");
        printHouseData(yourHouse);
    }

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor()
                + "\nand has " + house.getNumStories() + " stories"
                + "\nand " + house.getNumWindows() + " windows.");
        System.out.println();
    }
}
