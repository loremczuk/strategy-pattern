package pl.oremczuk.strategypattern.implementations;

import pl.oremczuk.strategypattern.api.Motorbike;

public class HarleyDavidson extends Motorbike {

    private boolean leatherBags;

    public HarleyDavidson(String type, String horsePower, boolean leatherBags) {
        super(type, horsePower);
        this.leatherBags = leatherBags;
    }

    @Override
    public void travel() {
        System.out.println("I'm driving a Harley-Davidson: " + getType() + " " + getHorsePower());

    }
}
