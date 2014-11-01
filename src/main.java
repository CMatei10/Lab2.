import lab.animals.AnimalDomestic;
import lab.animals.AnimalSalbatic;
import lab.animals.Animale;
import lab.exceptions.MamiferException;
import lab.interfaces.IMamifer;

/**
 * Created by CristiaN1 on 11/1/2014.
 */
public class main {
    public static void main(String[] args) {
        IMamifer mamifer1=new AnimalSalbatic("leu",false,5);
        IMamifer mamifer2=new AnimalDomestic("vaca",true,"Andrei");
        Animale animal1=new AnimalSalbatic("zebra",false,0);
        AnimalSalbatic salbatic=new AnimalSalbatic("hiena",false,2);
        AnimalDomestic domestic=new AnimalDomestic("caine",true,"Andreea");


        try {
            mamifer1.Mamifer();
        } catch (MamiferException e) {
            e.printStackTrace();
        }

        try {
            mamifer1.info();
        } catch (MamiferException e) {
            e.printStackTrace();
        }

        System.out.println(salbatic.getDenumire()+" este un animal domestic?\n" + (salbatic.EDomestic("hiena") ? "Yes!" : "No!"));

        System.out.println(domestic.getDenumire()+" este un animal domestic?\n" + (domestic.EDomestic("caine") ? "Yes!" : "No!"));

    }
}
