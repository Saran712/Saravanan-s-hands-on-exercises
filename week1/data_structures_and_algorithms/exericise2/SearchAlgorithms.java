package week1.datastructuresandalgorithms.exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    public static void sortProductsByName(Product[] productList) {
        Arrays.sort(productList, Comparator.comparing(p -> p.productName.toLowerCase()));
    }

    public static Product searchProductBinary(Product[] sortedProducts, String searchName) {
        int start = 0, end = sortedProducts.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int comparison = sortedProducts[mid].productName.compareToIgnoreCase(searchName);

            if (comparison == 0) return sortedProducts[mid];
            if (comparison < 0) start = mid + 1;
            else end = mid - 1;
        }
        return null;
    }

    public static Product searchProductLinear(Product[] productList, String searchName) {
        for (Product product : productList) {
            if (product.productName.equalsIgnoreCase(searchName)) {
                return product;
            }
        }
        return null;
    }
}
