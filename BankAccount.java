public class BankAccount {

  private int accountID;
  private String password;
  private double balance;

  public BankAccount(int accountID, String password){
    this.accountID = accountID;
    this.password = password;
    balance = 0.0;
  }
  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    password = newPass;
  }

  public String toString(){
    return "#" + accountID + "\t$" + balance;
  }

  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    } else return false;
  }

  public boolean withdraw(double amount){
    if (amount >= 0 && balance - amount >= 0) {
      balance -= amount;
      return true;
    } else return false;
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }
}
