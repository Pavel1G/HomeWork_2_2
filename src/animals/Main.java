package animals;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 1, "Саванна", 60, "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 5, "Саванна", 50, "Листья деревьев");
        Herbivores horse = new Herbivores("Лошадь", 10, "Степь", 80, "Сено");

        Predators hyena = new Predators("Гиена", 2, "Саванна", 50, "Падаль");
        Predators tiger = new Predators("Тигр", 12, "Саванна", 75, "Другие животные");
        Predators bear = new Predators("Медведь", 7, "Лес", 45, "Растительная еда");

        Amphibian frog = new Amphibian("Лягушка", 1, "Болото");

        FlightlessBirds peacock = new FlightlessBirds("Павлин", 7, "Джунгли", "Пешком");
        FlightlessBirds penguin = new FlightlessBirds("Пингвин", 12, "Льды Антарктиды", "Плавает");
        FlightlessBirds dodo = new FlightlessBirds("Птица Додо", 5, "Джунгли", "Бегает");

        FlyingBirds gull = new FlyingBirds("Чайка", 2, "Водоемы", "Летает над водой");
        FlyingBirds albatross = new FlyingBirds("Альбатрос", 7, "Океаны", "Летает над водой");
        FlyingBirds falcon = new FlyingBirds("Сокол", 3, "Степи", "Летает над поверхностью");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("----------------------------------------------");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println("----------------------------------------------");
        System.out.println(frog);
        System.out.println("----------------------------------------------");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println("----------------------------------------------");
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}
