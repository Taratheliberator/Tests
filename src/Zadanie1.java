
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int codeOfASII = scanner.nextInt();
        char simbolFromASII = (char) codeOfASII;
        if ((codeOfASII >= 'A' & codeOfASII <= 'Z') || (codeOfASII >= 'a' & codeOfASII <= 'z')) {
            System.out.println("Это буква английского алфавита " + simbolFromASII);
        } else {
            System.out.println("Это не буква английского алфавита, а символ " + simbolFromASII);
        }
    }
}
