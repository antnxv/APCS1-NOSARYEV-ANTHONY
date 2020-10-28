public class BankAccount {

  private int accountID;
  private String password;
  private double balance;

  public BankAccount(int createAccountID, String createPassword){
    accountID = createAccountID;
    password = createPassword;
    balance = 0.0;
  }
}
