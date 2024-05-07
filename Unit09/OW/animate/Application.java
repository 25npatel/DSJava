package animate;

import javax.swing.JFrame;

public class Application extends JFrame {

    public Application(String title) {
        Board board = new Board();
        this.add(board);

        // Set JFrame size to match the board size
        int application_width = (int) board.getPreferredSize().getWidth();
        int application_height = (int) board.getPreferredSize().getHeight();

        this.setTitle(title);
        this.setSize(application_width, application_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Application ap = new Application("OW!!!");
            ap.setVisible(true);

            SoundClip sitarClip = new SoundClip("media/Sitar.wav");
            sitarClip.setLoop(true);
            sitarClip.open();
            sitarClip.play();
        });
    }
}
