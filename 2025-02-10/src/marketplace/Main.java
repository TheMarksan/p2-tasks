import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ShoppingCart> carrinhos = new ArrayList<>();
        ShoppingCart s1 = new ShoppingCart(1);


        s1.addProduct("Feijão", 13);
        s1.addProduct("Arroz", 9);
        s1.addProduct("Linguiça Toscana", 1);

        carrinhos.add(s1);

        s1.getContents();
        System.out.println("Total de itens: " + s1.getItemCount());
        System.out.println("Preço total: R$ " + s1.getTotalPrice());

        s1.removeProduct("Arroz");
        System.out.println("\nApós remover 'Arroz':");
        s1.getContents();
        System.out.println("Total de itens: " + s1.getItemCount());
        System.out.println("Preço total: R$ " + s1.getTotalPrice());
    }
}