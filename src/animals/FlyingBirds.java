package animals;

import java.util.Objects;

public class FlyingBirds extends Bird {

    private String typeOfMove;

    public FlyingBirds(String name, int age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);

        setLivingEnvironment(livingEnvironment);
        setTypeOfMove(typeOfMove);
    }

    @Override
    void eat() {
        System.out.println("Ем жучков в полете.");
    }

    @Override
    void sleep() {
        System.out.println("Сплю в гнезде или дупле.");
    }

    @Override
    void move() {
        System.out.println("Летаю в небе.");
    }

    void fly() {
        System.out.println("Птица летает.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBirds that = (FlyingBirds) o;
        return Objects.equals(typeOfMove, that.typeOfMove);
    }

    @Override
    public String toString() {
        return ("Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                ", тип передвижения - " + getTypeOfMove() + ". " +
                "Принадлежит классу -" + getClass());
    }

    public void setTypeOfMove(String typeOfMove) {
        if (typeOfMove == null || typeOfMove.isBlank()) {
            this.typeOfMove = "Летать в облаках";
        } else {
            this.typeOfMove = typeOfMove;
        }
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }
}
