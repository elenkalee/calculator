public class CreditPaymentService {
    public int calculate(int Months, int LoanAmount) {
        float YearlyRate = 9.99F;
        float MonthlyRate = YearlyRate/100/12;
        double MonthlyPayment = LoanAmount * (MonthlyRate / (1 - Math.pow (1 + MonthlyRate, - Months)));
        return (int) MonthlyPayment;
    }
}

// LoanAmount = 1_000_000;
//        Months = 12;
//        MonthlyPayment= 87_911;
//        YearlyRate = 9,99 %;

// LoanAmount = 1_000_000;
//        Months = 24;
//        MonthlyPayment = 46_140;
//        YearlyRate = 9,99 %;

// LoanAmount = 1_000_000;
//        Months = 36;
//        MonthlyPayment = 32_262;
//        YearlyRate = 9,99 %;


