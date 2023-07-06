package Section7;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House(2, 6, "red");
        House yourHouse = new House();

        yourHouse.setNumStories(3);
        yourHouse.setNumWindows(10);
        yourHouse.setColor("blue");

        System.out.println();
        System.out.println("Your house is " + yourHouse.getColor()
        + " and has " + yourHouse.getNumStories() + " stories"
        + " and " + yourHouse.getNumWindows() + " windows.");
        System.out.println();
        System.out.println("My house is " + myHouse.getColor()
                + " and has " + myHouse.getNumStories() + " stories"
                + " and " + myHouse.getNumWindows() + " windows.");
        System.out.println();
    }
}
