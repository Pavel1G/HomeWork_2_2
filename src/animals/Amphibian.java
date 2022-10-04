package animals;

import java.util.Objects;

public class Amphibian extends Animal {

    private String livingEnvironment;

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    @Override
    void eat() {
        System.out.println("Ем живность из водоемов.");
    }

    @Override
    void sleep() {
        System.out.println("Сплю фиг знает где.");
    }

    @Override
    void move() {
        System.out.println("Перемещаюсь в водоеме.");
    }

    void hunting() {
        System.out.println("Я охочусь.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian that = (Amphibian) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }

    @Override
    public String toString() {
        return ("Животное - " + getName() + ", возраст - " + getAge() + ", среда обитания - " + getLivingEnvironment());
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Данные неизвестны";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
}
