import java.util.Scanner;
public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Select the beverage type: ");
        String deviceType = input.nextLine();

        System.out.print("Enter The Store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales of PS5 consoles for " + storeName);
        int totalSales = input.nextInt();

        ConsoleSales sales =
                new ConsoleSales(deviceType, storeName,totalSales);

        sales.printReport();

        input.close();
    }


}
