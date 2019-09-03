package scrap.heap.refactor.entity;

public enum Shape {
    CIRCLE("CIRCLE"),
    SQUARE("SQUARE"),
    RECTANGLE("RECTANGLE");

    private final String value;

    Shape(final String v) {
        value = v;
    }

    public static Shape fromValue(final String v) {
        for (final Shape b : Shape.values()) {
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
