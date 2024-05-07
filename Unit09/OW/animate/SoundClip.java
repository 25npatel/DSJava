package animate;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundClip {

    private String filePath;
    private File audioFile;
    private AudioInputStream audioIn;
    private Clip clip;
    private boolean loop;

    public SoundClip(String path) {
        filePath = path;
        clip = null;
        loop = false;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public boolean getLoop() {
        return loop;
    }

    public void open() {
        try {
            audioFile = new File(filePath);
            audioIn = AudioSystem.getAudioInputStream(audioFile.getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioIn);
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Unable to initialize the Clip. Unsupported audio file.");
            System.err.println(e.getMessage());
            clip = null;
            return;
        } catch (IOException e) {
            System.err.println("Unable to initialize the Clip. IO Exception.");
            System.err.println(e.getMessage());
            return;
        } catch (LineUnavailableException e) {
            System.err.println("Unable to initialize the Clip. Line unavailable.");
            System.err.println(e.getMessage());
            return;
        }
    }

    public void play() {
        if (clip != null) {
            if (clip.isRunning()) {
                clip.stop();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
            clip.setFramePosition(0);
            if (loop) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                clip.start();
            }
        }
    }

    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void close() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
