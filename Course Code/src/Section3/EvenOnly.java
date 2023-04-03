package Section3;

public class EvenOnly {
    public static void main (String[] args) {
        int iterator = 0;
        while(iterator < 10){
            if (iterator % 2 != 0) {
                iterator++;
                continue;
            }
            System.out.print(iterator + "\t");
            iterator++;
        }
    }
}
