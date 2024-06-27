package cls.prob03;

public class Account {
  private final String accNo;
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
    if(this.balance < money) {
      System.out.println(this.accNo + " 계좌에 잔고가 부족하여 " + money + "만원 출금을 실패했습니다.");
    } else {
      this.balance -= money;
      System.out.println(this.accNo + " 계좌에 " + money + "만원이 출금되었습니다.");

    }
  }

  public String getAccNo() {
    return this.accNo;
  }

  public int getBalance() {
    return this.balance;
  }
}
