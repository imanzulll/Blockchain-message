package atmmanagement;

public class Atm {
    protected int cardNo;
    protected int pinNo;
    protected float balance;
    
    public Atm(int cardNo, int pinNo, float balance){
        this.cardNo = cardNo;
        this.pinNo = pinNo;
        this.balance = balance;    
    }
    
    protected int getCardNo(){
        return cardNo;
    }

    protected void setCardNo(int cardNo){
        this.cardNo = cardNo;
    }

    protected int getPinNo(){
        return pinNo;
    }

    protected void setPinNo(int pinNo){
        this.pinNo = pinNo;
    }
    
    protected float getBalance(){
        return balance;
    }

    protected void setBalance(float balance){
        this.balance = balance;
    }
    
    public float calculateBalance(){
        return balance;
    }
    
   
}


    
