package pattern.structural.facade;

public class AdminPaymentSystem implements IPayment {

    @Override
    public void payme(){
        System.out.println("From admin IPayment system..");
    }
}
