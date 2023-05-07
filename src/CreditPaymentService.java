public class CreditPaymentService {
    public int calculate(int sumCredit,int years,double percentCredit) {
        double monthPercent = percentCredit / (12*100);
        double sumMonth = years * 12;

        double monthPayment = sumCredit * monthPercent * Math.pow(1+monthPercent, sumMonth) / (Math.pow(1+monthPercent, sumMonth) - 1);

        return (int) monthPayment;
    }
}
