
package week1.data_structures_and_algorithms.exericise2.code;

public class Product {
    public int productId;
    public String productName;
    public String category;

    public Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    @Override
    public String toString() {
        return productId + ": " + productName + " (" + category + ")";
    }
}