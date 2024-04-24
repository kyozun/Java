import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();

        int choose = scanner.nextInt();
        switch (choose) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("DANH SACH SAN PHAM");
                repository.show();
                break;
            case 2:
                System.out.println("Cac san pham co gia tri tren 10000: ");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmountSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.println("San pham sau khi sap xep: ");
                break;
        }
    }
}