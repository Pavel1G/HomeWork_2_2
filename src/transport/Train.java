package transport;

public class Train extends Transport {
    private int cost;
    private int travelTime;
    private String beginStation;
    private String endStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed,
                 int cost, int travelTime, String beginStation, String endStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        if (cost < 0) {
            this.cost = Math.abs(cost);
        } else if (cost == 0) {
            this.cost = 500;
        } else {
            this.cost = cost;
        }

        if (travelTime == 0 || travelTime < 0) {
            this.travelTime = 3;
        } else {
            this.travelTime = travelTime;
        }

        if (beginStation == null || beginStation.isEmpty()) {
            this.beginStation = "Неизвестно";
        } else {
            this.beginStation = beginStation;
        }

        if (endStation == null || endStation.isEmpty()) {
            this.endStation = "Неизвестно";
        } else {
            this.endStation = endStation;
        }

        if (numberOfWagons == 0) {
            this.numberOfWagons = 3;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    void refill() {
        System.out.println("Заправить дизелем.");
    }

    void information() {
        System.out.printf("Поезд %s, модель %s, %d год выпуска в %s, скорость передвижения – %d км/ч," +
                        "отходит от %s и следует до станции %s. Цена поездки - %d рублей, " +
                        "в поезде %d вагонов \n",
                getBrand(), getModel(), getProductionYear(), getProductionCountry(), getMaxSpeed(), getBeginStation(),
                getEndStation(), getCost(), getNumberOfWagons());
    }

    public void setCost(int cost) {
        if (cost < 0) {
            this.cost = Math.abs(cost);
        } else if (cost == 0) {
            this.cost = 500;
        } else {
            this.cost = cost;
        }
    }

    public void setTravelTime(int travelTime) {
        if (travelTime == 0 || travelTime < 0) {
            this.travelTime = 3;
        } else {
            this.travelTime = travelTime;
        }
    }

    public void setBeginStation(String beginStation) {
        if (beginStation == null || beginStation.isEmpty()) {
            this.beginStation = "Неизвестно";
        } else {
            this.beginStation = beginStation;
        }
    }

    public void setEndStation(String endStation) {
        if (endStation == null || endStation.isEmpty()) {
            this.endStation = "Неизвестно";
        } else {
            this.endStation = endStation;
        }
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if (numberOfWagons == 0) {
            this.numberOfWagons = 3;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
    }

    public int getCost() {
        return cost;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }
}
