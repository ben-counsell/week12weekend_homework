public class Guitar extends Instrument {
    private int numberOfStrings;
    private AmplificationMethod amplificationMethod;

    public Guitar(double price, double cost, String colour, String material, int numberOfStrings, AmplificationMethod amplificationMethod) {
        super(price, cost, colour, material);
        this.setFamily(Family.STRING);
        this.numberOfStrings = numberOfStrings;
        this.amplificationMethod = amplificationMethod;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public AmplificationMethod getAmplificationMethod() {
        return amplificationMethod;
    }

    public String play() {
        return "guitar noises";
    }
}
