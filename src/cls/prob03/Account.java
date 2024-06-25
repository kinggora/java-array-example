package cls.prob03;

public class Account {
  private String accNo;
  private int balance;

  public Account(String accNo) {
    this.accNo = accNo;
    this.balance = 0;
  }

  public void save(int money) {
    this.balance += money;
    System.out.println(this.accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
  }

  public void deposit(int money) {
    this.balance -= money;
    System.out.println(this.accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
  }

  public String getAccNo() {
    return this.accNo;
  }

  public int getBalance() {
    return this.balance;
  }
}
