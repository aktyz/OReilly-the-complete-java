package Section3;

public class ContinueBreak {
    public static void main (String[] args) {
        int count = 0;
        System.out.println("Output when continue used in a while loop: ");
        while(count < 10) {
            if(count == 5) {
                count++;
                continue; // sends the execution to the top of the loop -
                // starts a new iteration
            };
            System.out.print(count + "\t");

            count++;
        };
        count = 0;
        System.out.println("\nOutput when break used in a while loop: ");

        while (count < 10) {
            if(count == 5) {
                count++;
                break; // break out of the loop entirely
            };
            System.out.print(count + "\t");
            count++;
        }

    }
}
