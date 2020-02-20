import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму пополнения счета в рублях без копеек: ");
        int transfer = input.nextInt();
        int limit = 1000;
        int bonus;
        if (transfer >= limit) {
            bonus = transfer / 100;
        }
        else {
            bonus = 0;
        }
        int startCount = 100;
        int count = startCount + transfer + bonus;
        System.out.println("Размер начисленного бонуса: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету: " + count + " руб.");
    }
}
