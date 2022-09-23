package human;

public class Human {
    public int yearOfBirth;
    public String name;
    public String city;
    public String position;

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
        if (yearOfBirth < 0 || name == null || city == null || position == null) {
            System.out.printf("Имя - %s. \n Город - %s. \n Год рождения - %d. \n Должность - %s", name, city,
                    yearOfBirth, position);
        } else {
            System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s." +
                            "Будем знакомы!\n",
                    name, city, yearOfBirth, position);
        }
    }
}
