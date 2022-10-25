package racingcar;

public class Car {

    private final String name;

    public Car(String name) {
        if (!isCorrectLength(name))
            throw new IllegalArgumentException();
        this.name = name;
    }

    private boolean isCorrectLength(String name) {
        return name.length() >= 1 && name.length() <= 5;
    }

    public String getName() {
        return name;
    }
}
