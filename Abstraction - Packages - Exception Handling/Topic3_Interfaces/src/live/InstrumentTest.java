package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class InstrumentTest {

    public static void main(String[] args) {
        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println("\nUsing a Playable-type reference (interface polymorphism):");
        Playable instrument = new Veena();
        instrument.play();

        instrument = new Saxophone();
        instrument.play();
    }
}
