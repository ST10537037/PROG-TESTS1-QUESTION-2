public abstract class Consoles implements iConsole {
    private String deviceType;
    private String storeName;
    private int totalSales;

    public Consoles(String deviceType,String storeName,int totalSales)
    {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return deviceType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}


