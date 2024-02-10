public class CreditPaymentService {
    public int calculate(int timeMonth, int sumCreditRub, double ratePersent) {
        double coeffInMonth; // Ставка по кредиту в месяц
        double coeffAnnuity; // Коэффициент аннуитета
        double paymantMonth; // Ежемесячный платеж
        coeffInMonth = ratePersent / 12 / 100;
        coeffAnnuity = (coeffInMonth * Math.pow((1 + coeffInMonth), timeMonth)) / (Math.pow((1 + coeffInMonth), timeMonth) - 1);
        paymantMonth = sumCreditRub * coeffAnnuity;
        return (int) paymantMonth;

    }
}
