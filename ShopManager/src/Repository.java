import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Product> listProducts = new ArrayList<>();

    public Repository() {
        listProducts.add(new Product("01", "Banh doraemon 3 vi", Category.FOOD, 100, 3500, 57));
        listProducts.add(new Product("02", "Xuc xich suon non", Category.FOOD, 150, 3500, 12));
        listProducts.add(new Product("03", "Thanh cua", Category.FOOD, 100, 5000, 85));
        listProducts.add(new Product("04", "Banh khoai mon", Category.FOOD, 200, 4200, 78));
        listProducts.add(new Product("05", "Thia an com inox ma vang", Category.HOUSEWARE, 50, 8000, 4));
        listProducts.add(new Product("06", "Bat dung 3 vi", Category.FOOD, 65, 4000, 44));
        listProducts.add(new Product("07", "Nuoc hoa hong", Category.COSMETICS, 140, 639000, 7));
        listProducts.add(new Product("08", "Combo goi xa", Category.COSMETICS, 50, 249000, 24));
        listProducts.add(new Product("09", "Tinh chat duong am", Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("10", "Kem duong the", Category.COSMETICS, 80, 715000, 63));
        listProducts.add(new Product("11", "Ao thun", Category.FASHION, 250, 32000, 146));
    }

    public void show() {
        listProducts.forEach(product -> System.out.println(product));
    }

    public void sortProductByName() {
        listProducts.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public void filterProductByPrice() {
        listProducts.stream().filter(product -> product.getPrice() > 10000).forEach(product -> System.out.println(product));
    }

    public void countProductByAmountSale() {
        long count = listProducts.stream().filter(product -> product.getPrice() >= 50).count();
        System.out.println("So luong san pham ban duoc tu 50 tro len la: " + count);
    }
}
