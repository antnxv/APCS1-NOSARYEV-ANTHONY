public class BankAccount {

  private int accountID;
  private String password;
  private double balance;

  public BankAccount(int createAccountID, String createPassword){
    accountID = createAccountID;
    password = createPassword;
    balance = 0.0;
  }
  public double getBalance() {return balance;}

  public int getAccountID() {return accountID;}

  public void setPassword(String newPass) {password = newPass;}

  public String toString() {return accountID + "\t" + balance;}
}
