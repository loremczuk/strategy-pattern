package pl.oremczuk.strategypattern.implementations;

import pl.oremczuk.strategypattern.api.Car;

public class Skoda extends Car {

    private boolean budgetCar;

    public Skoda(String engine, String body, String make, boolean budgetCar) {
        super(engine, body, make);
        this.budgetCar = budgetCar;
    }

    @Override
    public void travel() {
        System.out.println("I'm driving a Skoda: " + getMake() + " " + getEngine() + " " + getBody());

    }
}
