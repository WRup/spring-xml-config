package wrup.spring.b_scope_i_import;

import wrup.spring.b_scope_i_import.silnik.Silnik;

/**
 * Ziarno springowe, do którego wstrzykiwany zostaje Silnik. {@link Silnik}
 *
 * @author Wiktor Rup
 */
public class Samochód {


    private int ilośćOdpaleń = 1;
    private Silnik silnik;

    public Samochód() {
    }

    public Samochód(Silnik silnik) {
        this.silnik = silnik;
    }

    public Silnik getSilnik() {
        System.out.println("Odpalam samochod " + ilośćOdpaleń++ + " raz");
        return silnik;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }
}
