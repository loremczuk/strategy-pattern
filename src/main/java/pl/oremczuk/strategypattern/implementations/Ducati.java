package pl.oremczuk.strategypattern.implementations;

import pl.oremczuk.strategypattern.api.Motorbike;

public class Ducati extends Motorbike {

    private boolean leanForwardPosition;

    public Ducati(String type, String horsePower, boolean leanForwardPosition) {
        super(type, horsePower);
        this.leanForwardPosition = leanForwardPosition;
    }

    @Override
    public void travel() {
        System.out.println("I'm driving a Ducati: " + getType() + " " + getHorsePower());

    }
}
