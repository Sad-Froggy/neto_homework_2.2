public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int currentMoney = 20;
        int refillAmount = 101;
        int refillBonusDiveder = 100;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int refilBonus = refillAmount > refillBonusDiveder ? refillAmount / refillBonusDiveder : 0;
        int finalAmount = currentMoney + refillAmount + refilBonus;
        System.out.println("на счет поступило " + refilBonus + " бонусных рублей. текущий баланс : " + finalAmount);

    }
}