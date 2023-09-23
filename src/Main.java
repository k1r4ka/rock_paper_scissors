import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //final String[] choices ={"камень", "ножницы", "бумага"};
        int compChoice = random.nextInt(3);

        System.out.println("начало игры");
        System.out.println("выберите вариант");
        System.out.println("""
                0. камень
                1. ножницы
                2. бумага
                """);
        int playerChoice = scanner.nextInt()-1;

        System.out.println(compChoice);
        if (playerChoice == compChoice) {
            System.out.println("ничья");
        } else if (playerChoice == 0 && compChoice == 1 || playerChoice == 1 && compChoice == 2 || playerChoice == 2 && compChoice == 0) {
            System.out.println("победил игрок");
        } else {
            System.out.println("победил компьютер");
        }
    }
}