package animals;

public abstract class Bird extends Animal {

    private String livingEnvironment;

    public Bird(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }


    @Override
    abstract void eat();

    @Override
    abstract void sleep();

    @Override
    abstract void move();

    void hunting() {
        System.out.println("Я охочусь.");
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
