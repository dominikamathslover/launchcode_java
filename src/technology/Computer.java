package technology;

public class Computer extends AbstractEntity {
    private BrandComputerST brand;
    private int memory;
    private float price;

    public Computer(int anEntityID, BrandComputerST aBrand) {
        super(anEntityID);
        brand = aBrand;
    }



    public int getMemory() {
        return memory;
    }

    public BrandComputerST getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
