import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int number = scanner.nextInt();
        int digit;
        int maxDigit = number % 10;;

        while (number > 0) {
            digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number = number / 10;
        }
        System.out.println("Максимальное цифра в числе: " + maxDigit);
    }
}
