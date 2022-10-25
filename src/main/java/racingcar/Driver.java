package racingcar;

public class Driver {

    private final String name;

    public Driver(String name) {
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
