
import java.util.Scanner;

public class zadanie5 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("������� �����: (��� ���������� ������� ������ ������)");
            input = scanner.nextLine();
            if ("".equals(input)) {
                break;
            }
            int number = Integer.parseInt(input);
            sum = sum + number;
        }
        System.out.print("����� ����� " + sum);
    }
}

