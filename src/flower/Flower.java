package flower;

public class Flower {
    public String name;
    private String flowerColor;
    private String country;
    private float cost;
    public int lifeSpan;

    public Flower(String name, String flowerColor, String country, float cost) {
        this(name, flowerColor, country, cost, 3);
    }

    public Flower(String name, String flowerColor, String country, float cost, int lifeSpan) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    void information() {
        System.out.printf("Цветок - %s, цвет - %s, из страны - %s, стоимость %.2f рублей, срок стояния - %d дней. \n",
                name, getFlowerColor(), getCountry(), getCost(), lifeSpan);
    }
}
