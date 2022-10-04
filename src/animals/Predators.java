package animals;


import java.util.Objects;

public class Predators extends Mammals {

    private String typeFood;

    public Predators(String name, int age, String livingEnvironment, int speedMoving, String typeFood) {
        super(name, age, livingEnvironment, speedMoving);

        if (typeFood == null || typeFood.isBlank()) {
            this.typeFood = "Мясо";
        } else {
            this.typeFood = typeFood;
        }
    }

    @Override
    void eat() {
        System.out.println("Жру мясо.");
    }

    @Override
    void sleep() {
        System.out.println("Сплю как мясо.");
    }

    @Override
    void move() {
        System.out.println("Передвигаюсь как кусок мяса.");
    }

    @Override
    public void walk() {
        System.out.println("Гуляю как кусок мяса)");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeFood, predators.typeFood);
    }

    @Override
    public String toString() {
        return ("Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment() +
                ", скорость передвижения - " + getSpeedMoving() + " км/ч, рацион питания - " + getTypeFood() + ". " +
                "Принадлежит классу -" + getClass());
    }

    public String getTypeFood() {
        return typeFood;
    }
}
