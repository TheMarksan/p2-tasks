package INSS;

public class Company extends Payer {
    private int employees;

    public Company(String name, double income, int employees) {
        super(name, income);
        this.employees = employees;
    }

    @Override

    public double getTax(){
        double tax = (employees > 10) ? income*0.14 : income*0.16;
        return tax;
    }
}
