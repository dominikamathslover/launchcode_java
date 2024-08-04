package technology;

public class SmartPhone extends AbstractEntity {
    private int batterymAh = 5000;
    private int memoryRamGB = 4;
    private BrandPhone brand;

    public SmartPhone(int anEntityID, BrandPhone aBrand) {
        super(anEntityID);
        brand = aBrand;
    }


    public int getBatterymAh() {
        return batterymAh;
    }

    public int getMemoryRamGB() {
        return memoryRamGB;
    }

    public BrandPhone getBrand() {
        return brand;
    }

}
