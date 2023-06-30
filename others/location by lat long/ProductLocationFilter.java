import java.util.ArrayList;
import java.util.List;

public class ProductLocationFilter {

    public List<Product> filterProductsByRadius(List<Product> productList, double givenLatitude, double givenLongitude, double radius) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : productList) {
            double distance = calculateDistance(product.getLatitude(), product.getLongitude(), givenLatitude, givenLongitude);
            if (distance <= radius) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371; 
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return earthRadius * c;
    }
}
