package marketplace;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, ShoppingCart> carrinhos = new HashMap<>();
        ShoppingCart jambo = new ShoppingCart(1);
        carrinhos.put(jambo.getCustomerId(), jambo);
        ShoppingCart jambo2 = new ShoppingCart(2);
        carrinhos.put(jambo2.getCustomerId(), jambo2);

        Product pimba = new TV("Samsung Pimba", 3666, 70);
        Product moiaPouco = new Refrigerator("Moia Pouco", 5700, 150);
        Product poucoAssa = new Stove("Pouco Assa", 7500, 6);

        jambo.addProduct(pimba);
        jambo.addProduct(moiaPouco);
        jambo.addProduct(poucoAssa);


        int customerID = 2;
        ShoppingCart cart = carrinhos.get(customerID);

        if (cart != null) {
            cart.getContents();
            System.out.println("Total de itens: " + cart.getItemCount());
            System.out.println("Preço total: R$ " + cart.getTotalPrice());

        }else{
            System.out.println("Carrinho não encontrado para o cliente " + customerID);
        }

        String itemRemovido = pimba.getName();
        jambo.removeProduct(pimba);
        System.out.println("\nApós remover " + itemRemovido + ":");
        jambo.getContents();
        System.out.println("Total de itens: " + jambo.getItemCount());
        System.out.println("Preço total: R$ " + jambo.getTotalPrice());


    }
}