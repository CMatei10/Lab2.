package lab.interfaces;

import lab.exceptions.MamiferException;

/**
 * Created by CristiaN1 on 11/1/2014.
 *
 * Aceasta este interfata pentru toate tipurile de animale.
 */
public interface IMamifer {

    public void Mamifer() throws MamiferException;
    public void info() throws  MamiferException;

}
