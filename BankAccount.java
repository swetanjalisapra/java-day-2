public class BankAccount {
   private double acntBal=10_000;
   private Address address; 
   private AccountType accountType;
   private long accountId;
   private static long INITIAL_ACCOUNT_ID_VALUE = 10_000;
    public BankAccount(AccountType accountType,double initialDepAmt,Address address) {
        if(initialDepAmt>10_000){
            this.acntBal = initialDepAmt;

        }
        this.accountType = accountType;
        this.address = address;
        this.accountId = ++ INITIAL_ACCOUNT_ID_VALUE;
    }
    
    public BankAccount(AccountType accountType,Address address) {
        this.accountType = accountType;
        this.address = address;
        this.accountId = ++ INITIAL_ACCOUNT_ID_VALUE;
      }
      public BankAccount(Address address) {
        this.address = address;
      }
   public double checkbal() {
       return acntBal;
   }
   public void deposit(double depositMoney) {
    this.acntBal += depositMoney;
   }
   public long getId(){
       return accountId;
   }

   public double withdraw(double withdrawalAmt) {
       switch(this.accountType){
           case SAVINGS_ACCOUNT:
           if(this.acntBal - withdrawalAmt > 10_000)
           {
            this.acntBal = this.acntBal - withdrawalAmt;
            return withdrawalAmt;
        
              
           }
           break;
           case SALARIED_ACCOUNT:
           if(this.acntBal - withdrawalAmt > 0)
           {
            this.acntBal = this.acntBal - withdrawalAmt;
            return withdrawalAmt;
        
              
           }
           break;
           case CURRENT_ACCOUNT:
           if(this.acntBal - withdrawalAmt > 10_000)
           {
            this.acntBal = this.acntBal - withdrawalAmt;
            return withdrawalAmt;
        
              
           }
           break;
       }
      
      
       return 0;
   
}
public void AccountType(AccountType accountType) {
    this.accountType = accountType;
}
public void Address(Address address) {
    this.address = address;
  }
}