package animals;

import java.util.Objects;

public abstract class Mammals extends Animal {

    private String livingEnvironment;
    private int speedMoving;

    public Mammals(String name, int age, String livingEnvironment, int speedMoving) {
        super(name, age);

        if (livingEnvironment == null || livingEnvironment.isEmpty() || livingEnvironment.isBlank()) {
            this.livingEnvironment = "Данные неизвестны";
        } else {
            this.livingEnvironment = livingEnvironment;
        }

        if (speedMoving == 0) {
            this.speedMoving = 10;
        } else {
            this.speedMoving = speedMoving;
        }

    }


    @Override
    abstract void eat();

    @Override
    abstract void sleep();

    @Override
    abstract void move();

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedMoving == mammals.speedMoving && Objects.equals(livingEnvironment, mammals.livingEnvironment);
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

    public int getSpeedMoving() {
        return speedMoving;
    }

    public void setSpeedMoving(int speedMoving) {
        if (speedMoving == 0) {
            this.speedMoving = 10;
        } else {
            this.speedMoving = speedMoving;
        }
    }
}
