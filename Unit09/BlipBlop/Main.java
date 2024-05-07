import java.awt.EventQueue;
import animate.*;

public class Main {
    public static void main(String[] args) {
    
        EventQueue.invokeLater(() -> {
            
            Application myApp = new Application("PartB*");
            myApp.setVisible(true);
            
        });
    }
}