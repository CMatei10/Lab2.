package lab.animals;

import lab.exceptions.MamiferException;
import lab.interfaces.IMamifer;

/**
 * Created by CristiaN1 on 11/1/2014.
 */
public class AnimalDomestic extends Animale implements IMamifer {
    String stapan;

    public AnimalDomestic(String den, boolean ISdomestic, String stapan) {
        super(den, ISdomestic);
        this.stapan = stapan;
    }

    public String getStapan(){
        return stapan;
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
        System.out.println("Suntem in subclasa AnimalDomestic a clasei Animale!");
    }
}
