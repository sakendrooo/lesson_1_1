import java.util.Scanner;
import java.util.concurrent.ForkJoinWorkerThread;

public class Main {
    public static void main(String[] args) {
        String tellMe;
        final int NUM = 2022;
        String word = "magazine";
        tellMe = NUM + word;
        System.out.println(tellMe);

        if (NUM < 0) {
            System.out.println("вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("вы сохранили положительное число");
        } else {
            System.out.println("вы сохранили 0");
        }

        System.out.println("Bведите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name);

    }
}