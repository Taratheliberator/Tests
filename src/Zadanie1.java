
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����");
        int codeOfASII = scanner.nextInt();
        char simbolFromASII = (char) codeOfASII;
        if ((codeOfASII >= 'A' & codeOfASII <= 'Z') || (codeOfASII >= 'a' & codeOfASII <= 'z')) {
            System.out.println("��� ����� ����������� �������� " + simbolFromASII);
        } else {
            System.out.println("��� �� ����� ����������� ��������, � ������ " + simbolFromASII);
        }
    }
}
