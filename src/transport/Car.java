package transport;

import java.time.LocalDate;

public class Car extends Transport{

    public static class Key {

        private final boolean isRemoteEngineStart;
        private final boolean isKeylessAccess;
        public Key() {
            this(false, false);
        }

        public Key(boolean isRemoteEngineStart, boolean isKeylessAccess) {
            this.isRemoteEngineStart = isRemoteEngineStart;
            this.isKeylessAccess = isKeylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return isKeylessAccess;
        }

    }
    public static class Insurance {

        private LocalDate expireDate;
        private double cost;
        private String number;
        public Insurance() {
            this(null, 10000, "123456789");
        }

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.equals((LocalDate.now()))) {
                System.out.println("Нужно срочно менять страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }
    private double engineVolume;

    private String gear;

    private final String typeOfBody;

    private String regNumber;

    private final int seatsCount;

    private boolean summerTyres;

    private Key key;

    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               Key key,
               Insurance insurance
    ) {
        super(brand, model, productionYear, productionCountry, color, 0);

        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }


        this.gear = "МКПП";
        this.regNumber = "x000xx000";
        this.typeOfBody = "Седан";
        this.seatsCount = 5;
        this.summerTyres = true;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }


    void information() {
        System.out.printf("%s %s, %d год выпуска, сборка - %s, цвет - %s, объем двигателя - %.1f, коробка передач - %s," +
                        "рег.номер - %s, тип кузова - %s, количество мест - %d, резина - %s," +
                        "бесключевой доступ - %s, удаленный запуск двигателя - %s, номер страховки - %s," +
                        "стоимость страховки - %.2f рублей, срок действия страховки - %s \n",
                getBrand(), getModel(), getProductionYear(), getProductionCountry(), getColor(), engineVolume, gear,
                regNumber, typeOfBody, seatsCount,
                isSummerTyres() ? "летняя" : "зимняя",
                key.isKeylessAccess() ? "есть" : "нет",
                key.isRemoteEngineStart() ? "есть" : "нет",
                insurance.getNumber(), insurance.getCost(), insurance.getExpireDate());
    }


    @Override
    void refill() {
        System.out.println("Заправить бензином");
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }


    public String getBodyType() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }


    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null || gear.isEmpty() || gear.isBlank()) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
//x000xx000
        char[] chars = regNumber.toCharArray();
        if (Character.isAlphabetic(chars[0]) || Character.isAlphabetic(chars[4]) || Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) || Character.isDigit(chars[2]) || Character.isDigit(chars[3]) || Character.isDigit(chars[6])
                || Character.isDigit(chars[7]) || Character.isDigit(chars[8]);
    }
}
