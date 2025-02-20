package INSS;

abstract class Payer {
    protected String name;
    protected double income;

    public Payer(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public abstract double getTax();

    @Override
    public String toString() {
        return name + ": " + "$ " + String.format("%.2f", getTax());
    }
}
