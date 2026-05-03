package pattern.structural.facade;

public class EmployeePaymentSystem implements IPayment {

    @Override
    public void payme(){
        System.out.println("From employee IPayment system..");
    }

}
