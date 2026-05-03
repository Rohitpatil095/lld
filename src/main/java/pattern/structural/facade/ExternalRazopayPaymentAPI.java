package pattern.structural.facade;

import java.util.UUID;

public class ExternalRazopayPaymentAPI {

    UUID paymentID;
    String payeeName;
    String payerName;

    ExternalRazopayPaymentAPI(String payeeName, String payerName){
        paymentID=UUID.randomUUID();
        this.payeeName=payeeName;
        this.payerName=payerName;
    }

    public void makePayment(){
        System.out.printf("Paid by %s to %s with UUID is %s",this.payeeName,this.payerName,this.paymentID);
    }



}
