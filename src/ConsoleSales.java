public class ConsoleSales extends Consoles {
    public ConsoleSales(String deviceType, String storeName, int totalSales) {
        super(deviceType, storeName, totalSales);
    }
    public void printReport(){
        System.out.println();
        System.out.println("CONSOLE SALES REPORT REPORT");
        System.out.println("***********************");
        System.out.println("CONSOLE TYPE:" + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: "+getTotalSales() );
    }
}
