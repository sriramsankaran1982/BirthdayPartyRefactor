package scrap.heap.refactor.entity;

public class Cake {

    private Flavor flavor;
    private Flavor frostingFlavor;
    private Shape shape;
    private Size size;
    private Color cakeColor;

    public Flavor getFlavor() {
        return flavor;
    }

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public Flavor getFrostingFlavor() {
        return frostingFlavor;
    }

    public void setFrostingFlavor(Flavor frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getCakeColor() {
        return cakeColor;
    }

    public void setCakeColor(Color cakeColor) {
        this.cakeColor = cakeColor;
    }

    public static class Builder {
        private final Cake cake = new Cake();

        public Builder() {
        }

        public Cake.Builder size(Size size) {
            this.cake.setSize(size);
            return this;
        }

        public Cake.Builder shape(Shape shape) {
            this.cake.setShape(shape);
            return this;
        }

        public Cake.Builder cakeColor(Color color) {
            this.cake.setCakeColor(color);
            return this;
        }

        public Cake.Builder frostingFlavor(Flavor frostingFlavor) {
            this.cake.setFrostingFlavor(frostingFlavor);
            return this;
        }

        public Cake.Builder flavor(Flavor flavor) {
            this.cake.setFlavor(flavor);
            return this;
        }


        public Cake build() {
            return this.cake;
        }
    }
}
