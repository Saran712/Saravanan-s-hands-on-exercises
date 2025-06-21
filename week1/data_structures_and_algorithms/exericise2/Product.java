
package week1.data_structures_and_algortihms.exercise2;

public class Product {
    public int id;
    public String name;
    public String productCategory;

    public Product(int identifier, String productName, String category) {
        this.id = identifier;
        this.name = productName;
        this.productCategory = category;
    }

    @Override
    public String toString() {
        return id + ": " + name + " (" + productCategory + ")";
    }
}