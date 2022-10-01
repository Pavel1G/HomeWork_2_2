package transport;

public class Bus extends Transport {

    private String typeFuel;

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    @Override
    void refill() {
        System.out.println("Заправить газом");
    }


    void information() {
        System.out.printf("%s %s, %d год выпуска, сборка - %s, цвет - %s, максимальная скорость - %d км/ч. \n",
                getBrand(), getModel(), getProductionYear(), getProductionCountry(), getColor(), getMaxSpeed());
    }
}
