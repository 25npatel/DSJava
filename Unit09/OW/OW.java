import animate.*;

import java.awt.EventQueue;

public class OW {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application ap = new Application("OW!!!");
            ap.setVisible(true);
            SoundClip sitarClip = new SoundClip("media/Sitar.wav");
            sitarClip.setLoop(true);
            sitarClip.open();
            sitarClip.play();
        });
    }
}
