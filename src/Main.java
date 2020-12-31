public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int MonthlyPayment12months = service.calculate(12,1_000_000);
        System.out.println(MonthlyPayment12months);

        int MonthlyPayment24months = service.calculate(24,1_000_000);
        System.out.println(MonthlyPayment24months);

        int MonthlyPayment36months = service.calculate(36,1_000_000);
        System.out.println(MonthlyPayment36months);
    }
}
