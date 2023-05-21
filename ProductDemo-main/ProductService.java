import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //FUNCTION TO GET THS LIST OF PRODUCTS WHICH CONTAINS THE TEXT "black"
    // public List<Product> getProductWithText(String text) {
    //     String str = text.toLowerCase();
    //     List<Product> prods = new ArrayList<>();

    //     for(Product p : products){
    //         String name = p.getName().toLowerCase();
    //         String type = p.getType().toLowerCase();
    //         String place = p.getPlace().toLowerCase();
    //         if(name.contains(str) || type.contains(str) || place.contains(str))
    //             prods.add(p);
    //     }
    //     return prods;

    // }

    
    // USING STREAM API
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        
        return products.stream()
        //filter method is used to filter the products from the list
        .filter(p -> p.getName().toLowerCase().contains(str) //checking black in the name 
        || p.getType().toLowerCase().contains(str) //checking black in the type
        || p.getPlace().toLowerCase().contains(str))//checking black in place
        .collect(Collectors.toList());
    }
    
    
    //FUNCTION TO GET PRODUCTS BY PLACE NAME

    // public List<Product> getProductByPlace(String text){
    //     String str = text.toLowerCase();
    //     List<Product> prods = new ArrayList<>();

    //     for(Product p : products){
    //         String place = p.getPlace().toLowerCase();
    //         if(place.contains(str))
    //             prods.add(p);
    //     }
    //     return prods;
    // }

    //USING STREAM API
    public List<Product> getProductByPlace(String text) {
        String str = text.toLowerCase();
    
        return products.stream()
                .filter(p -> p.getPlace().toLowerCase().contains(str))
                .collect(Collectors.toList()); //here collect method is used to collect the elements into a List by help of Collectors class.
    }
    
    //function to get products out of warranty

    // public List<Product> getOutOfWarrantyProducts(){
    //     List<Product> prods = new ArrayList<>();

    //     for(Product p : products){
    //         if(p.getWarranty() < 2022)
    //             prods.add(p);
    //     }
    //     return prods;
        
    // }
     
    // USING STREAM API
    public List<Product> getOutOfWarrantyProducts(){
        
        return products.stream()
                .filter(p->(p.getWarranty() < 2023))
                .collect(Collectors.toList());

    }
}
