package car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
                2021, "Германия");
        Car kia = new Car("KIA", "Sportage 4", 2.4, "красный",
                2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея");

        lada.information();
        audi.information();
        bmw.information();
        kia.information();
        hyundai.information();
    }
}
