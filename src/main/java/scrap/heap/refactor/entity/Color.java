package scrap.heap.refactor.entity;

public enum Color {
    RED("RED"),
    BLUE("BLUE"),
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    PURPLE("PURPLE"),
    BLACK("BLACK"),
    WHITE("WHITE"),
    BROWN("BROWN");

    private final String value;

    Color(final String v) {
        value = v;
    }

    public static Color fromValue(final String v) {
        for (final Color b : Color.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
