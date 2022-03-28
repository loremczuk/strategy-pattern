package pl.oremczuk.strategypattern.api;

public abstract class Car implements Vehicle {

    private String engine;
    private String body;
    private String make;

    public Car(String engine, String body, String make) {
        this.engine = engine;
        this.body = body;
        this.make = make;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
