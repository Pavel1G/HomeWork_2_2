package transport;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", 1.7, "желтый",
                2015, "Россия", null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия", null, null);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный",
                2021, "Германия", null, null);
        Car kia = new Car("KIA", "Sportage 4", 2.4, "красный",
                2018, "Южная Корея", null, null);
        kia.setRegNumber("в432вв152");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый",
                2016, "Южная Корея", null, null);

        lada.information();
        audi.setKey(new Car.Key(true, true));
        audi.information();
        bmw.information();
        kia.information();
        hyundai.information();


        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия", null,
                301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", null,
                270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        lastochka.information();
        leningrad.information();

        Bus paz = new Bus("ПАЗ", "0172", 1989, "Россия", "оранжевый", 110);
        Bus liaz = new Bus("ЛИАЗ", "225", 1975, "Украина", "белый", 70);
        Bus maz = new Bus("МАЗ", "792", 2015, "Россия", "оранжевый", 140);

        paz.information();
        liaz.information();
        maz.information();
    }
}
