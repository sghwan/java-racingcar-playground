package domain;

public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public int move(int random) {
        if (isMovable(random))
            return 1;

        return 0;
    }

    private boolean isMovable(int random) {
        return random >= 4;
    }
}
