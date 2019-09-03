package scrap.heap.refactor.entity;

public enum Material {
    MYLAR("MYLAR"),
    LATEX("LATEX");

    private final String value;

    Material(final String v) {
        value = v;
    }

    public static Material fromValue(final String v) {
        for (final Material b : Material.values()) {
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
