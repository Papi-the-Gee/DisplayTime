
package displaytime.displaytime;

import java.util.Scanner;

public class DisplayTime {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter total seconds: ");
        int totalSeconds = input.nextInt();

        
        int minutes = totalSeconds / 60;
        int remainingSeconds = totalSeconds % 60;

        
        System.out.println("Minutes: " + minutes);
        System.out.println("Remaining Seconds: " + remainingSeconds);
    }
}