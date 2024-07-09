package test.t240627;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BankApplication {
  private static final Account[] accounts = new Account[100];
  private static int accLength = 0;

  public void start() {
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while(!exit) {
      printMenu();
      System.out.print("선택> ");
      String menu = sc.nextLine();
      switch (menu) {
        case "1" -> {
          printMenuTitle(menu);
          System.out.print("계좌번호: ");
          String accNum = sc.nextLine();
          System.out.print("계좌주: ");
          String holderName = sc.nextLine();
          System.out.print("초기입금액: ");
          String balance = sc.nextLine();
          if (validateAccNum(accNum) && validateHolderName(holderName) && validateBalance(balance)) {
            Account newAccount = new Account(accNum, holderName, Integer.parseInt(balance));
            createAccount(newAccount);
          }
        }
        case "2" -> {
          printMenuTitle(menu);
          printAccounts();
        }
        case "3" -> {
          printMenuTitle(menu);
          System.out.print("계좌번호: ");
          String accNum = sc.nextLine();
          System.out.print("예금액: ");
          String balance = sc.nextLine();
          if (validateAccNum(accNum) && validateBalance(balance)) {
            deposit(accNum, Integer.parseInt(balance));
          }
        }
        case "4" -> {
          printMenuTitle(menu);
          System.out.print("계좌번호: ");
          String accNum = sc.nextLine();
          System.out.print("출금액: ");
          String balance = sc.nextLine();
          if (validateAccNum(accNum) && validateBalance(balance)) {
            withdraw(accNum, Integer.parseInt(balance));
          }
        }
        case "5" -> {
          System.out.println("프로그램 종료");
          exit = true;
        }
        default -> System.out.println("메뉴 번호는 1~5 중 하나를 입력해주세요.");
      }
    }
  }

  private void createAccount(Account account) {
    if(isFull()) {
      System.out.println("생성할 수 있는 계좌 수를 초과했습니다.");
    } else if(isDuplicateAccount(account)) {
      System.out.println("이미 동일한 계좌번호가 존재합니다.");
    } else {
      accounts[accLength] = account;
      accLength++;
      System.out.println("결과: 계좌가 생성되었습니다.");
    }
  }

  private void printAccounts() {
    if(accLength == 0) {
      System.out.println("계좌가 존재하지 않습니다.");
    } else {
      for (int i = 0; i < accLength; i++) {
        Account acc = accounts[i];
        System.out.println(acc.getAccNum() + "\t" + acc.getHolderName() + "\t" + acc.getBalance());
      }
    }
  }

  private void deposit(String accNum, int balance) {
    Account account = findAccountByAccNum(accNum);
    if (account == null) {
      System.out.println("존재하지 않는 계좌번호 입니다.");
    } else {
      account.deposit(balance);
    }

  }

  private void withdraw(String accNum, int balance) {
    Account account = findAccountByAccNum(accNum);
    if (account == null) {
      System.out.println("존재하지 않는 계좌번호 입니다.");
      return;
    }
    try {
      account.withdraw(balance);
      System.out.println("결과: 출금이 성공되었습니다.");
    } catch (InsufficientException e) {
      System.out.println("결과: 잔고가 부족하여 출금을 실패했습니다.");
    }
  }


  private void printMenuTitle(String menu) {
    System.out.println("---------");
    switch (menu) {
      case "1" -> System.out.println("계좌생성");
      case "2" -> System.out.println("계좌목록");
      case "3" -> System.out.println(" 예 금");
      case "4" -> System.out.println(" 출 금");
    }
    System.out.println("---------");
  }

  private void printMenu() {
    System.out.println("-------------------------------------");
    System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
    System.out.println("-------------------------------------");
  }

  private boolean isFull() {
    return accounts.length == accLength;
  }

  private boolean isDuplicateAccount(Account account) {
    for(int i = 0; i < accLength; i++) {
      if(account.getAccNum().equals(accounts[i].getAccNum())) {
        return true;
      }
    }
    return false;
  }

  private Account findAccountByAccNum(String accNum) {
    for(int i = 0; i < accLength; i++) {
      if(accNum.equals(accounts[i].getAccNum())) {
        return accounts[i];
      }
    }
    return null;
  }

  private boolean validateAccNum(String accNum) {
    String regex = "^\\d{3}-\\d{3}$";
    boolean result = Pattern.matches(regex, accNum);
    if(!result) {
      System.out.println("계좌번호는 ***-*** 형태로 입력해주세요.");
    }
    return result;
  }

  private boolean validateBalance(String balance) {
    int iBalance;
    try{
      iBalance = Integer.parseInt(balance);
    } catch (NumberFormatException e) {
      System.out.println("금액은 1 이상의 숫자를 입력해주세요.");
      return false;
    }
    if(iBalance < 1) {
      System.out.println("금액은 1원 이상을 입력해주세요.");
      return false;
    }
    return true;
  }

  private boolean validateHolderName(String holderName) {
    String korRegex = "^[ㄱ-ㅎ가-힣]*$";
    String engRegex = "^[a-zA-Z]*$";
    if(Pattern.matches(korRegex, holderName) || Pattern.matches(engRegex, holderName)) {
      return true;
    }
    System.out.println("계좌주는 한글 이름 또는 영문 이름을 입력해주세요.");
    return false;
  }

}
