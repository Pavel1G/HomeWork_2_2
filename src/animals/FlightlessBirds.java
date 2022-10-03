package animals;

import java.util.Objects;

public class FlightlessBirds extends Bird {

    private String typeOfMove;

    public FlightlessBirds(String name, int age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);

        setLivingEnvironment(livingEnvironment);
        setTypeOfMove(typeOfMove);
    }


    @Override
    void eat() {
        System.out.println("Кушаю букашек и жучков в земле, травушку.");
    }

    @Override
    void sleep() {
        System.out.println("Сплю на земле.");
    }

    @Override
    void move() {
        System.out.println("Бегаю как ощипанная курица. Стоп. Я же и есть ощипанная курица.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlightlessBirds that = (FlightlessBirds) o;
        return Objects.equals(typeOfMove, that.typeOfMove);
    }

    @Override
    public String toString() {
        return ("Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - " + getTypeOfMove() + ". " +
                "Принадлежит классу -" + getClass());
    }

    void walk() {
        System.out.println("Нелетающая птица гуляет.");
    }

    public void setTypeOfMove(String typeOfMove) {
        if (typeOfMove == null || typeOfMove.isBlank()) {
            this.typeOfMove = "Пешком";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }
}
