import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ProductManager productManager = new ProductManager(products);
        Product product1 = new Product(1,"quat",500);
        productManager.addProduct(0,product1);
        productManager.addProduct(1,new Product(2,"cam",700));
        productManager.addProduct(2,new Product(3,"buoi",300));
        productManager.addProduct(3,new Product(4,"ngo",1000));
        productManager.showProducts();
    }
}
