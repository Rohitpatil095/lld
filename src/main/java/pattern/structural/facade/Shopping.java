package pattern.structural.facade;

public class Shopping {

    public static void main(String[] args) {


        IPayment payment=new AdminPaymentSystem();
        payment.payme();

//        without adapter not possible as external classes/methods
//        IPayment payment=new ExternalRazopayPaymentAPI();
//        payment.payme();

        IPayment externalPayment=new ExternalRazopayPaymentAPIAdapter("rancher","steller");
        externalPayment.payme();

    }
}
