package animals;

import java.util.Objects;

public class Amphibians extends Animal {

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Данные неизвестны";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    @Override
    void eat() {

    }

    @Override
    void sleep() {

    }

    @Override
    void move() {

    }

    void hunting() {
        System.out.println("Я охочусь.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
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
        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Данные неизвестны";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
}
