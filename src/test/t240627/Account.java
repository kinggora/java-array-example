package test.t240627;

public class Account {

  private final String accNum;
  private final String holderName;
  private int balance;

  public Account(String accNum, String holderName, int balance) {
    this.accNum = accNum;
    this.holderName = holderName;
    this.balance = balance;
  }

  public String getAccNum() {
    return accNum;
  }

  public String getHolderName() {
    return holderName;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int balance) {
    this.balance += balance;
  }

  public void withdraw(int balance) throws InsufficientException {
    if(this.balance < balance) {
      throw new InsufficientException();
    }
    this.balance -= balance;
  }
}
