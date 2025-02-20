package marketplace;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override //legibilidade (anotation)
    //@Override anonation: sobrescrevendo de <classe pai>
    //final: n pode extends
    //abstract: classe apenas para extends (n é possível criar uma instância de uma classe abstract)
    public String toString() {
        return "Product{" + "name=" + this.name + ", price=" + this.price + '}';
    }
}
