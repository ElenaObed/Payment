public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthPaymentOneYears = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Ежемесячный платеж: " + monthPaymentOneYears);

        int monthPaymentTwoYears = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Ежемесячный платеж: " + monthPaymentTwoYears);

        int monthPaymentThreeYears = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Ежемесячный платеж: " + monthPaymentThreeYears);

    }
}
