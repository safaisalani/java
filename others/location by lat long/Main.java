import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product 1", 40.7128, -74.0060));
        productList.add(new Product("Product 2", 34.0522, -118.2437));
        productList.add(new Product("Product 3", 51.5074, -0.1278));
        productList.add(new Product("Product 4", 40.7489, -73.9680));

 
        double givenLatitude = 40.7128;
        double givenLongitude = -74.0060;
        double radius = 10; // km

        ProductLocationFilter filter = new ProductLocationFilter();
        List<Product> filteredProducts = filter.filterProductsByRadius(productList, givenLatitude, givenLongitude, radius);

  
        System.out.println("Products within " + radius + " km of (" + givenLatitude + ", " + givenLongitude + "):");
        for (Product product : filteredProducts) {
            System.out.println(product.getName());
        }
    }
}
