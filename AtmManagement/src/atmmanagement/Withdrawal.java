package atmmanagement;

public class Withdrawal extends Atm{
    
    private int withdraw;
    
    public Withdrawal(int cardNo, int pinNo, float balance, int withdraw){
        super(cardNo, pinNo, balance);
    }

    public int getWithdraw(){
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
            
    @Override
    public float calculateBalance(){
        if(balance >= withdraw)
        return  balance - withdraw;
        else
        return balance - 0;
    }
}
