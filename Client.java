public class Client{
public static void main(String[] args) {
    Address address = new Address("202", "bangalore","24 street,malviya nagar" , 577142);
    BankAccount bankAccount = new BankAccount(AccountType.SAVINGS_ACCOUNT,2000,address);
    BankAccount bankAccount2 = new BankAccount(AccountType.SALARIED_ACCOUNT,address);
 

}
}