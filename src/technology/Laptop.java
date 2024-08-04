package technology;

public class Laptop extends AbstractEntity {
    private BrandPC brand;
    private float size= 15.6f;
    private float price;


    public Laptop(int anEntityID, BrandPC aBrand) {
        super(anEntityID);
        brand= aBrand;
    }
    // 1 property and one method

    public BrandPC getBrand() {
        return brand;
    }

    public float getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
