package human;

public class Human {
    private int yearOfBirth;
    public String name;
    private String city;
    public String position;

    Human() {
        this(0, null, null, null);
    }

    Human(int yearOfBirth, String name, String city, String position) {

        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }

        if (position == null) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    void presentation() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s." +
                        "Будем знакомы!\n",
                name, city, yearOfBirth, position);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }
}
