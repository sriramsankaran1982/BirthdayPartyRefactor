package scrap.heap.refactor.entity;

public class Balloon {
    private Color color;
    private Material material;
    private Integer number;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static class Builder {
        private final Balloon balloon = new Balloon();

        public Builder() {
        }

        public Balloon.Builder number(Integer number) {
            this.balloon.setNumber(number);
            return this;
        }

        public Balloon.Builder material(Material material) {
            this.balloon.setMaterial(material);
            return this;
        }

        public Balloon.Builder color(Color color) {
            this.balloon.setColor(color);
            return this;
        }

        public Balloon build() {
            return this.balloon;
        }
    }
}
