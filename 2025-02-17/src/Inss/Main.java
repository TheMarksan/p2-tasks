package INSS;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payer> payers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        sc.nextLine(); //limpeza de buffer de entrada

        for (int i = 1; i <= n; i++) {
            System.out.println("Individual or company (i/c)? ");
            String choose = sc.nextLine();
            String name;
            double anualIncome;
            double tax;

            if(choose.equals("i")){
                System.out.println("Tax payer #"+(i)+" data:");
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Anual income: ");
                anualIncome = sc.nextDouble();
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                sc.nextLine(); //limpeza de buffer de entrada

                Payer np = new Individual(name, anualIncome, healthExpenditures);
                payers.add(np);
            }else if(choose.equals("c")){
                System.out.println("Tax payer #"+(i)+" data:");
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Anual income: ");
                anualIncome = sc.nextDouble();
                System.out.println("Number of employees: ");
                int employeers = sc.nextInt();

                sc.nextLine(); //limpeza de buffer de entrada

                Payer np = new Company(name, anualIncome, employeers);
                payers.add(np);
            }

        }

        double totalTaxes = 0;
        System.out.println("TAXES PAID: ");
        for (Payer np : payers) {
            System.out.println(np);
            totalTaxes += np.getTax();
        }

        System.out.println("TOTAL TAXES: $"+totalTaxes);
    }


}
