public class Main {
    public static void main(String[] args) {
        int limit = 100000;
        int transfer = 130_000;
        int bonus;
        if (transfer >= limit) {
            bonus = transfer / 100;
            }
        else {
            bonus = 0;
        }
        int startCount = 10_000;
        int bonusPlus = bonus / 100;
        int count = (startCount + transfer) /100 + bonusPlus;
        System.out.println("Размер начисленного бонуса: " + bonusPlus + " руб.");
        System.out.println("Итоговая сумма на счету клиента: " + count + " руб.");
    }
}

