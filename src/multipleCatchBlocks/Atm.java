package multipleCatchBlocks;

import java.io.IOException;

public class Atm {
    public static void main(String[] args) {
        transferAmount transfer = new transferAmount();
        BankAccount bank = new BankAccount();

        try {

            bank.getConnection();

            transfer.handleSecurityException(bank);

            bank.getStatus();

            transfer.getTransfer(500);



        } catch (IOException e) {

            System.out.println("IOException caught in main method: " + e.getMessage());

        } catch (SecurityException e) {

            System.out.println("SecurityException caught in main method: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Generic Exception caught in main method: " + e.getMessage());
        }
    }
}
