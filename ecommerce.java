import java.util.*;
import java.util.stream.Collectors;

class Product {
    private String id;
    private String name;
    private int stockQuantity;

    public Product(String id, String name, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
    }

    public int getStockQuantity() { return stockQuantity; }
    public String getName() { return name; }
}

public class ecommerce {
    public static void main(String[] args) {
        List<Product> inventory = Arrays.asList(
            new Product("P1", "Laptop", 10),
            new Product("P2", "Mouse", 0),
            new Product("P3", "Keyboard", 0)
        );
        List<Product> outOfStock = inventory.stream()
            .filter(p -> p.getStockQuantity() <= 0)
            .collect(Collectors.toList());

        System.out.println("Unavailable Items:");
        outOfStock.forEach(p -> System.out.println(p.getName()));
    }
}
