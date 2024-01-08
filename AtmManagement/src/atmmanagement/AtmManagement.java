package atmmanagement;

import java.util.Scanner; 

public class AtmManagement{
    
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
  
    Atm mybalance,mywithdraw,mytrans;

               System.out.println("WELCOME TO AUTOMATED TELLER MACHINE");
               System.out.print("Please enter card number: ");
               int cardNo = input.nextInt();
               System.out.print("Please enter pin number: ");
               int pinNo = input.nextInt();
               
               System.out.println("CHECK BALANCE");
               System.out.println("Balance : ");
               float balance = input.nextFloat();
               mybalance = new Atm(cardNo,pinNo,balance);
                
               System.out.println("WITHDRAWN MONEY");
               mywithdraw = new Withdrawal();
               System.out.print("ENTER TOTAL MONEY TO BE WITHDRAWN: ");
               ((Withdrawal)mywithdraw).setWithdraw(input.nextInt());
               
               System.out.println("TRANSFER MONEY");
               mytrans = new Transaction();
               System.out.print("ENTER TOTAL MONEY TO BE TRANSFER: ");
               ((Transaction)mytrans).setTrans(input.nextInt());
               
              
  }
}