package domain;

public class Name {
    private final String name;
    private static final int VALID_NAME_LENGTH = 5;

    public Name(String name) {
        if (name.length() > VALID_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
        }
        this.name = name;
    }
}
