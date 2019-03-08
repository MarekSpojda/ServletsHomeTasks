public class Worker {
    private String description;
    private double cash;

    public Worker(String description, double cash) {
        this.description = description;
        this.cash = cash;
    }

    public String getDescription() {
        return description;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}