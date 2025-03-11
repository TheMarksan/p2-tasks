package InternetBanking;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Account> contas = new ArrayList<>();

            Account conta1 = new Account(1, "marco", 2000, 1000);

            contas.add(conta1);

            for (int i = 0; i < contas.size(); i++) {
                System.out.println(contas.get(i));
            }

            System.out.println("Hello, World!");
    }
}