package lab.animals;

import lab.exceptions.MamiferException;
import lab.interfaces.IMamifer;

/**
 * Created by CristiaN1 on 11/1/2014.
 */
public class AnimalSalbatic extends Animale implements IMamifer {

    public int victime;

    public AnimalSalbatic(String den, boolean ISdomestic, int victime) {
        super(den, ISdomestic);
        this.victime = victime;
    }

    public int getVictime() {
        return victime;
    }

    @Override
    public boolean EDomestic(String denumire) {
        return false;
    }

    @Override
    public void Mamifer() throws MamiferException {
        System.out.println("Acesta este un animal domestic?" + getISdomestic());
    }

    @Override
    public void info() throws MamiferException {
        System.out.println("It's OK!");
    }

}
