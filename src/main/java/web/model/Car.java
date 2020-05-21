package web.model;

public class Car {
    private String brand;
    private String model;
    private Long price;

    public Car() {
    }

    public Car(String brand, String model, Long price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Long getPrice() {
        return price;
    }
}
