public class Main {
    public static void main(String[] args) {
        long balans = 120;
        long refill = 1400;
        long bonus;
        long newbalans;
        if (refill >=1000) {
            bonus = refill/100;
        } else {
            bonus = 0;
        }
        newbalans = balans + refill + bonus;
        System.out.println(" Бонус = " + bonus );
        System.out.println(" Баланс счета = " + newbalans );
    }
}
