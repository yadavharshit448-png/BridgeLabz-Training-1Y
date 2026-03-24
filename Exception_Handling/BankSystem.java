public class BankSystem{


    int Balance = 1000;
    public void withdraw(int amount){
        
        try{
            if(amount>Balance){
                throw new InsufficientBalanceException("insufficient balance");
            }
            Balance = Balance - amount;
            System.out.println("Amount withdrawn successfully:" + Balance);
        }
        catch(InsufficientBalanceException e ){
            System.out.println("Exception handled inside method:" + e.getMessage());
        }

}
    }
    public static void main (String[]args){
        BankSystem bs = new BankSystem();
        bs.withdraw(200000);
    } 