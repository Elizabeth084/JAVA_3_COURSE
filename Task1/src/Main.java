import java.util.HashMap;
import java.util.Map;

public class Main {
        public static void main(String[] args) {
                ProductFactory productFactory = new ProductFactory();
                productFactory.createProduct(Product.Type.SHOES);

        }
}
