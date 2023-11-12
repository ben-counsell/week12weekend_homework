public class Piano extends Instrument {
    private int numberOfKeys;
    private String type;

    public Piano(double price, double cost, String colour, String material, int numberOfKeys, String type) {
        super(price, cost, colour, material);
        this.setFamily(Family.STRING);
        this.numberOfKeys = numberOfKeys;
        this.type = type;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getType() {
        return type;
    }

    public String play() {
        return "piano noises";
    }
}
