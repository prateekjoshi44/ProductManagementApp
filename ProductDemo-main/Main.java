import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        // hey service, add the products..

        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

        // List<Product> products = service.getAllProducts();
        // for(Product p : products){
        // System.out.println(p);
        // }
        // System.out.println("==============================================");
        //
        // System.out.println("a Particular product");
        //
        // Product p = service.getProduct("Logi Mouse");
        // System.out.println(p);

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Products which contains text 'black'");
        List<Product> prods = service.getProductWithText("black");
        // using stream api
        System.out.println();
        System.out.println("Using Stream API");
        Stream<Product> pds = prods.stream();
        pds.forEach(System.out::println);

       


        System.out.println();
        System.out.println("==============================================");
        System.out.println("Search by place");
        List<Product> byplace = service.getProductByPlace("Black Table");
        // using stream api
        System.out.println();
        System.out.println("Using Stream API");
        byplace.forEach(System.out::println);


        System.out.println();
        System.out.println("==============================================");
        System.out.println("Products out of Warranty");
        List<Product> outOfWarranty = service.getOutOfWarrantyProducts();
        // using stream api
        System.out.println();
        System.out.println("Using Stream API");
        outOfWarranty.forEach(System.out::println);
    }
}
