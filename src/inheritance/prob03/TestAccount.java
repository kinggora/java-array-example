package inheritance.prob03;

public class TestAccount {

  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount("12345", "홍길동", 1000000, "1234 5678 9012");
    checkingAccount.pay(100000000, "1234 5678 9012");
    checkingAccount.pay(500000, "1234 5678 9012");
    checkingAccount.pay(500000, "1234 5678 3333");
  }
}
