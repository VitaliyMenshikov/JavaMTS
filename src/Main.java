public class Main {
    public static void main(String[] args) {

        int balance = 300;  // Начальный баланс
        int addBalance = 1400; // Сумма пополнения
        int bonus = 1; //Бонусы за каждые 100 р
        int addBonus; //начисленные боусы
        if (addBalance > 1000) {
            addBonus = addBalance / 100 * bonus;
        } else {
            addBonus = 0;
        }
        int sum = balance + addBonus + addBalance;
        System.out.println("Сумма после пополнения:" + sum);

    }
}

