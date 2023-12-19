package multipleCatchBlocks;

import java.io.IOException;

public class transferAmount {

    int availableBalance=1000;

    public void getTransfer(int transferAmount) throws Exception{
        if(availableBalance>=transferAmount){
            availableBalance = availableBalance-transferAmount;
            System.out.println("Remaining Balance: "+availableBalance);
            System.out.println("Transferred Successfully ");
        }else{
            throw  new Exception("Insufficient Funds");
        }
    }



    public void handleSecurityException(BankAccount bank) throws SecurityException{
        try{
            bank.getMPin(6677);
        }catch(SecurityException e){
            System.out.println("Wrong Pin");
            throw e;
        }
    }


}
