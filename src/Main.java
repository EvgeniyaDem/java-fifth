//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int timeMonth = 12;
        int sumCreditRub = 1_000_000;
        double ratePersent = 9.99;
        int paymantMonth = service.calculate(timeMonth, sumCreditRub, ratePersent);
        System.out.println(paymantMonth);

        System.out.println();
        System.out.println("12, 1_000_000, 9.99");
        System.out.println(service.calculate(12, 1_000_000, 9.99));

        System.out.println();
        System.out.println("24, 1_000_000, 9.99");
        System.out.println(service.calculate(24, 1_000_000, 9.99));

        System.out.println();
        System.out.println("36, 1_000_000, 9.99");
        System.out.println(service.calculate(36, 1_000_000, 9.99));

    }
}
