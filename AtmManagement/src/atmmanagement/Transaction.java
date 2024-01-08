package atmmanagement;

public class Transaction extends Atm{
    
    private int trans;
    
    public Transaction(int cardNo, int pinNo, float balance, int trans){
        super(cardNo, pinNo, balance);
    }

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }
            
    @Override
    public float calculateBalance(){
        if(balance >= trans)
        return  balance - trans;
        else
        return balance - 0;
    }
}

