package flower;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная", null, "Голландия", 35.59f, 0);
        Flower goldenDaisy = new Flower("Хризантема", null, null, 15f, 5);
        Flower peony = new Flower("Пион", null, "Англия", 69.9f, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5f, 10);

        rose.information();
        goldenDaisy.information();
        peony.information();
        gypsophila.information();

        printCostOfFlower(rose, rose, rose, goldenDaisy, goldenDaisy, goldenDaisy, goldenDaisy, goldenDaisy, gypsophila);
    }

    public static void printCostOfFlower(Flower... flowers) {
        float totalCost = 0;
        int minimalLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimalLifeSpan) {
                minimalLifeSpan = flower.lifeSpan;
            }

            totalCost += flower.getCost();
        }
        System.out.printf("Стоимость букета - %.2f рублей, минимальный срок стояния - %d дней.", totalCost * 1.1, minimalLifeSpan);
    }
}
