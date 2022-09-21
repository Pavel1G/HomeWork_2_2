package human;

public class Human {
    public int yearOfBirth;
    public String name;
    public String city;
    public String position;

    Human(int yearOfBirth, String name, String city, String position) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.city = city;
        this.position = position;
    }

    void presentation() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s." +
                        "Будем знакомы!\n",
                name, city, yearOfBirth, position);
    }
}
