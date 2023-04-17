// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int account = 100;
        int refill = 1100;
        int bonus = 100;
        int score;

        if (refill > 1000) {
            score = refill / bonus;
            refill = refill + score;
        } else {
            score = 0;
        }

        account = account + refill;

        System.out.println("Итоговый счет = " + account + " руб.");
        System.out.println("Бонусные рубли = " + score+ " руб.");

    }
}