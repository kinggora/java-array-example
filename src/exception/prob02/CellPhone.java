package exception.prob02;

public class CellPhone {
  private String model;
  private double battery;

  public CellPhone(String model) {
    this.model = model;
  }

  public void call(int time) {
    if (time < 0) {
      throw new IllegalArgumentException("통화시간입력오류");
    } else if(battery - time * 0.5 < 0) {
      battery = 0;
    } else {
      battery -= time * 0.5;
    }
    System.out.println("통화 시간 : " + time + "분");
  }

  public void charge(int time) {
    try {
      if (time < 0) {
        throw new IllegalArgumentException("통화시간입력오류");
      }
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    if(battery + time * 3 > 100) {
      battery = 100;
    } else {
      battery += time * 3;
    }
    System.out.println("충전 시간 : " + time + "분");
  }

  public void printBattery() {
    System.out.println("남은 배터리 양 : " + battery);
  }

}
