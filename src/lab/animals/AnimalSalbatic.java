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
        return denumire != null && getISdomestic();
    }

    @Override
    public void Mamifer() throws MamiferException {
        if (getDenumire()==null) {
            System.out.println("Denumire animal invalida!");
            return;
        }
        System.out.println(getDenumire()+" este un mamifer!");
    }

    @Override
    public void info() throws MamiferException {
        System.out.println("Suntem in subclasa AnimalSalbatic a clasei Animale!");
    }

}
