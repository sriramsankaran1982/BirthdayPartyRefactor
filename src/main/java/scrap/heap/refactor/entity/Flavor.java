package scrap.heap.refactor.entity;

public enum Flavor {
    VANILLA("VANILLA"),
    CHOCLATE("CHOCLATE"),
    BUTTERSCOTCH("BUTTERSCOTCH");

    private final String value;

    Flavor(final String v) {
        value = v;
    }

    public static Flavor fromValue(final String v) {
        for (final Flavor b : Flavor.values()) {
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
