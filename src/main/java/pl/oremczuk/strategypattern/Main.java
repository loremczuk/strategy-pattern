package pl.oremczuk.strategypattern;

import pl.oremczuk.strategypattern.api.Vehicle;
import pl.oremczuk.strategypattern.implementations.BMW;
import pl.oremczuk.strategypattern.implementations.Ducati;
import pl.oremczuk.strategypattern.implementations.HarleyDavidson;
import pl.oremczuk.strategypattern.implementations.Skoda;

public class Main {

    public static void main(String[] args) {

        Vehicle bmw = new BMW("3.0d", "coupe", "5 series", true);
        Vehicle skoda = new Skoda("2.0", "sedan", "Octavia", true);
        Vehicle harley = new HarleyDavidson("cruiser", "63HP", true);
        Vehicle ducati = new Ducati("sports bike", "202HP", true);

        bmw.travel();
        skoda.travel();
        harley.travel();
        ducati.travel();


    }

}
