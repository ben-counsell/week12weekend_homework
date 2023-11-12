import java.util.ArrayList;

public class Shop {
    public ArrayList<ISell> stock;
    public double till;
    public double revenue;
    public double profit;

    public Shop(double till) {
        this.stock = new ArrayList<>();
        this.till = till;
        this.revenue = 0;
        this.profit = 0;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getProfit() {
        return profit;
    }

    public void addToStock(ISell newStock) {
        this.stock.add(newStock);
    }

    public void removeFromStock(ISell stockToRemove) {
        this.stock.remove(stockToRemove);
    }

    public void sell(ISell item) {
        this.stock.remove(item);
        this.till += item.getPrice();
        this.revenue += item.getPrice();
        this.profit += item.calculateMarkup();
    }
}
