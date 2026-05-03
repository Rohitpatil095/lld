package pattern.structural.facade;

public class ExternalRazopayPaymentAPIAdapter implements  IPayment{

    private ExternalRazopayPaymentAPI externalRazopayPaymentAPI;

    public ExternalRazopayPaymentAPIAdapter(String sender,String receiver){
        externalRazopayPaymentAPI=new ExternalRazopayPaymentAPI(sender,receiver);
    }


    @Override
    public void payme(){

        System.out.println("from external razopay payment api adapter..");
        externalRazopayPaymentAPI.makePayment();
    }

}
