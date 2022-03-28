package pl.oremczuk.strategypattern.implementations;

import pl.oremczuk.strategypattern.api.Car;

public class BMW extends Car {

    private boolean rearWheelDrive;

    public BMW(String engine, String body, String make, boolean rearWheelDrive) {
        super(engine, body, make);
        this.rearWheelDrive = rearWheelDrive;
    }

    @Override
    public void travel() {

        System.out.println("I'm driving a BMW: " + getMake() + " " + getEngine() + " " + getBody());

    }
}
