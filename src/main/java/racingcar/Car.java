package racingcar;

public class Car {

    private final Driver driver;
    private int position;

    public Car(Driver driver, int position) {
        this.driver = driver;
        this.position = position;
    }

    public Car(Driver driver) {
        this.driver = driver;
        this.position = 0;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getPosition() {
        return position;
    }

    public void move(int randomNumber) {
        if (isMove(randomNumber))
            position += 1;
    }

    private boolean isMove(int randomNumber) {
        return randomNumber > 3;
    }
}
