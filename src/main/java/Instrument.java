public abstract class Instrument implements IPlay, ISell {
    private double price;
    private double cost;
    private String colour;
    private String material;
    private Family family;

    public Instrument(double price, double cost, String colour, String material) {
        this.price = price;
        this.cost = cost;
        this.colour = colour;
        this.material = material;
        this.family = null;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return cost;
    }

    public double calculateMarkup() {
        return price - cost;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
