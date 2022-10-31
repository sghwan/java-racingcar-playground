package domain;

public class Position {
    private int position;

    public Position() {
        this.position = 0;
    }

    public int moveForward() {
        return this.position += 1;
    }

    public int getPosition() {
        return position;
    }
}
