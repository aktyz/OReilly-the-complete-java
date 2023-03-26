package Section2;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;
        int currentAge = 2023 - 1987;

        String myName = "John";
        String yourName = "Johnny";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge? : " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge? : " + ageComparison);

        ageComparison = yourAge >= bobsAge;
        System.out.println("yourAge >= bobsAge? : " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge? : " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match? : " + nameComparison);

        ageComparison = currentAge >= 21;
        System.out.println("Am I older than 21? : " + ageComparison);
        System.out.println("What's my age actually? : " + myAge);
    } //end main
}
