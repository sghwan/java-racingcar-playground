package domain;

public class Name {
    private final String name;
    private static final int VALID_MAX_LENGTH = 5;
    private static final int VALID_MIN_LENGTH = 1;

    public Name(String name) {
        if (name.length() > VALID_MAX_LENGTH || name.length() < VALID_MIN_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 1~5자 여야 합니다.");
        }
        this.name = name;
    }
}
