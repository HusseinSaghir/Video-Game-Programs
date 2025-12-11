import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GGStriveUKeyPresser {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            
            System.out.println("Guilty Gear Strive 'U' Key Presser");
            System.out.println("Starting in 5 seconds... Switch to the game window!");
            System.out.println("Press Ctrl+C in this terminal to stop the script.");
            
            // Countdown before starting
            for (int i = 5; i > 0; i--) {
                System.out.println("Starting in " + i + "...");
                robot.delay(1000);
            }
            
            // Configuration
            int pressDelay = 100;    // Time between presses in milliseconds
            int pressDuration = 50;  // How long the key is held down
            
            System.out.println("Pressing 'U' key repeatedly...");
            
            while (true) {
                // Press U key
                robot.keyPress(KeyEvent.VK_U);
                robot.delay(pressDuration);
                robot.keyRelease(KeyEvent.VK_U);
                
                // Delay between presses
                robot.delay(pressDelay);
                
                // Small sleep to prevent CPU overuse
                Thread.sleep(10);
            }
            
        } catch (AWTException | InterruptedException e) {
            System.out.println("Script stopped");
        }
    }
}