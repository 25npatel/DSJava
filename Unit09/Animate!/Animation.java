import java.awt.EventQueue;
import animate.Application;

public class Animation {
    public static void main(String[] args) {
    
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
            
        });

    }
}
