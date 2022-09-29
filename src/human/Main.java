package human;

public class Main {
    public static void main(String[] args) {

        Human maxim = new Human(1987, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1994, null, "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", null, "директор по развитию бизнеса");
        Human vladimir = new Human();
        vladimir.setCity("Казань");
        vladimir.setYearOfBirth(2001);

        maxim.presentation();
        anya.presentation();
        katya.presentation();
        artem.presentation();
        vladimir.presentation();
    }
}