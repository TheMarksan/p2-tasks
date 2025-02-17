package marketplace;

import java.util.ArrayList;


public class ShoppingCart {
    private int customerId;
    private ArrayList<Product> list;

    public ShoppingCart(int customerId) {
        this.customerId = customerId;
        this.list = new ArrayList<>();
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void removeProduct(Product product) {
        list.remove(product);
    }

    public void getContents() {
        if (list.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return;
        }

        System.out.println("Itens no carrinho:");
        list.forEach(p -> System.out.println("Nome: " + p.getName() + " | Preço: R$ " + p.getPrice()));
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getItemCount() {
        return list.size();
    }

    public double getTotalPrice() {
        return list.stream().mapToDouble(Product::getPrice).sum();
    }
}

