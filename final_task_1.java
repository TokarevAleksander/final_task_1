import java.util.Scanner;

public class final_task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий курс доллара: ");
        double exchangeRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rublesAmount = scanner.nextDouble();

        double dollarsAmount = rublesAmount / exchangeRate;

        String formattedAmount = String.format("%.2f", dollarsAmount);

        System.out.println("Итого: " + formattedAmount.replace(".", ",") + " долларов");
    }
}