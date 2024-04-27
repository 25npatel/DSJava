import javax.sound.sampled.LineUnavailableException;

import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class MAIN {
    public static void main(String[] args) {
        
        ToneGenerator TG = new ToneGenerator();

        try {

            TG.init();

        } catch (LineUnavailableException e) {

            System.err.println("Unable to run!");

        }

        //Mary Had a Little Lamb!

        TG.play(Note.E4, 500);
        TG.play(Note.D4, 500);
        TG.play(Note.C4, 500);
        TG.play(Note.D4, 500);
        TG.play(Note.E4, 500);
        TG.play(Note.E4, 500);
        TG.play(Note.E4, 500);
        TG.play(Note.REST, 400);
        TG.play(Note.D4, 500);
        TG.play(Note.D4, 500);
        TG.play(Note.D4, 500);
        TG.play(Note.REST, 400);
        TG.play(Note.E4, 500);
        TG.play(Note.G4, 500);
        TG.play(Note.REST, 1);
        TG.play(Note.G4, 500);
        TG.close();

    }
}