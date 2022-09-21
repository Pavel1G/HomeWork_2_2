package car;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }


    void information() {
        System.out.printf("%s %s, %d год выпуска, сборка - %s, цвет - %s, объем двигателя - %.1f \n",
                brand, model, productionYear, productionCountry, color, engineVolume);
    }
}
