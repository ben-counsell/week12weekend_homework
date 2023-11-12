public class SheetMusic implements ISell {
    private double price;
    private double cost;
    private String title;
    private String composer;

    public SheetMusic(double price, double cost, String title, String composer) {
        this.price = price;
        this.cost = cost;
        this.title = title;
        this.composer = composer;
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

    public String getTitle() {
        return title;
    }

    public String getComposer() {
        return composer;
    }
}
