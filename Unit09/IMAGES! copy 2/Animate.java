import java.awt.EventQueue;
import animate.*;

public class Animate {
    public static void main(String[] args) {
    
        EventQueue.invokeLater(() -> {
            
            Application myApp = new Application("Title");
            myApp.setVisible(true);
            
        });
    }
}