import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String adj1, girlsName, adj2, occ1, place, clothing, hobby, adj3, occ2, boysName, mansName;

        System.out.print("Enter an adjective: \t");
        adj1 = keyboard.nextLine();
        System.out.print("Enter a boy's name: \t");
        girlsName = keyboard.nextLine();
        System.out.print("Enter another adjective: \t");
        adj2 = keyboard.nextLine();
        System.out.print("Enter an occupation: \t");
        occ1 = keyboard.nextLine();
        System.out.print("Enter the name of a place: \t");
        place = keyboard.nextLine();
        System.out.print("Enter the name of a piece of clothing: \t");
        clothing = keyboard.nextLine();
        System.out.print("Enter the name of a hobby: \t");
        hobby = keyboard.nextLine();
        System.out.print("Enter another adjective: \t");
        adj3 = keyboard.nextLine();
        System.out.print("Enter another occupation: \t");
        occ2 = keyboard.nextLine();
        System.out.print("Enter a girl's name: \t");
        boysName = keyboard.nextLine();
        System.out.print("Enter a woman's name: \t");
        mansName = keyboard.nextLine();


        System.out.print("There's once was a " + adj1 +" boy named " + girlsName + " who was a " + adj2
                + " " + occ1 + " in the Kingdom of " + place + ". \n");
        System.out.print("He loved to wear " + clothing + " and to " + hobby + ". He wanted to marry the "
                + adj3 + " " + occ2 + " named " + boysName + " but his mother, Queen " + mansName
                + " forbid him from seeing her.");
    }
}
