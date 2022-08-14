import java.util.Scanner;

public class zadanie4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = Math.abs(scanner.nextInt());
        numberOfDigits(number);// вызов метода или по другому функции
    }

    //сама функция или метод представлен ниже
    public static void numberOfDigits(int number) {
        if (number != 0) {
            int length = (int) (Math.log10(number) + 1);
            System.out.println("Количество разрядов: " + length);
        } else {
            System.out.println("Количество разрядов: " + 1);
        }//если ввести число равное 0
    }
}