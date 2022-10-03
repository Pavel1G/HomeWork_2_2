package animals;

import java.util.Objects;

public class Herbivores extends Mammals {

    private String typeFood;

    public Herbivores(String name, int age, String livingEnvironment, int speedMoving, String typeFood) {
        super(name, age, livingEnvironment, speedMoving);

        setLivingEnvironment(livingEnvironment);
    }

    @Override
    void eat() {
        System.out.println("Кущаю " + this.typeFood);
    }

    @Override
    void sleep() {
        System.out.println();
    }

    @Override
    void move() {

    }

    @Override
    public void walk() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeFood, that.typeFood);
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
