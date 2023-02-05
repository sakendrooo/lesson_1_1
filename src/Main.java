public class Main {
    public static void main(String[] args) {
        // Начало программы
        System.out.println("Привет мир!");


        System.out.println(5 + 3 * 4 / 2 - 1);
        System.out.println(5 + 3 * 4 / (2 - 1));
        System.out.println(13 % 3);

        System.out.println("Мне " + (2023 - 1988) + " лет.");
        System.out.println(2 + "9");
        System.out.println("Result: " + 8 + 12);
        System.out.println("Result: " + (8 + 12));

        int ageOfMyFriend = 24; // Объявление и инициализация переменной
        System.out.println(ageOfMyFriend + 10);
        System.out.println("Age of my best friend: " + ageOfMyFriend);

        ageOfMyFriend = 38; // переопределение переменной
        System.out.println("Age of my new friend: " + ageOfMyFriend);

        int number; // Объявление переменной
        char myFavoriteSymbol = 'x';
        boolean isSnowy = false;
        double digit = 90.123;
        System.out.println(myFavoriteSymbol + " " + isSnowy + " " + digit);
        number = 2023; // инициализация переменной
        String fullName = "John Black";
        System.out.println(fullName);

        final double TEMPERATURE = 8.5;
        // TEMPERATURE = 9.15;
    }
}
