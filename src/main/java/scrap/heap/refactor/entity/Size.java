package scrap.heap.refactor.entity;

public enum Size {
    LARGE("LARGE"),
    MEDIUM("MEDIUM"),
    SMALL("SMALL");

    private final String value;

    Size(final String v) {
        value = v;
    }

    public static Size fromValue(final String v) {
        for (final Size b : Size.values()) {
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
