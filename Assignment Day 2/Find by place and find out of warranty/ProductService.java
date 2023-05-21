import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }

    //NOTE: I ADDED THIS FUNCTION
    //THIS FUNCTION WILL RETURN ALL THE PRODUCTS WITH THE MATCHING PLACE SEARCHED BY THE USER
    //ASSIGNMENT 1
    public List<Product> getProductsWithPlace(String place) {

        List<Product> searchedList = new ArrayList<>();

        for(Product p : products){
            if(p.getPlace().contains(place))
                searchedList.add(p);
        }

        return searchedList;
    }

    //NOTE: I ADDED THIS FUNCTION
    //THIS FUNCTION WILL RETURN THE PRODUCTS WHICH ARE OUT OF WARRANTY
    //ASSIGNMENT 2
    public List<Product> getAllProductsWithoutWarranty(){

        List<Product> outOfWarranty = new ArrayList<>();

        LocalDate currentDate = LocalDate.now();

        int currentYear = currentDate.getYear();

        for(Product p : products){
            if(p.getWarranty() < currentYear)
                outOfWarranty.add(p);
        }

        return outOfWarranty;
    }
}
