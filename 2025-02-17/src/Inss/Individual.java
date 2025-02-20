package INSS;

public class Individual extends Payer {
    private double healthExpends;

    public Individual(String name, double income, double healthExpends) {
        super(name, income);
        this.healthExpends = healthExpends;
    }

    @Override

    public double getTax(){
        double tax = (income<20.000) ? income*0.15 : income*0.25;
        if(healthExpends>0){
            tax -= healthExpends*0.5;
        }

        return tax;
    }

}
