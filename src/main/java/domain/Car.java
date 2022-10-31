package domain;

public class Car {
    private final Name name;
    private final Position position;
    private static final int MOVE_VALUE = 4;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public int move(int random) {
        if (isMovable(random))
            return position.moveForward();

        return position.getPosition();
    }

    private boolean isMovable(int random) {
        return random >= MOVE_VALUE;
    }
}
