package cls.prob03;

public class Duck {

  private String name;
  private int legs;
  private int length;

  public void fly() {
    System.out.println("오리(" + this.name + ")는 날지 않습니다.");
  }

  public void sing() {
    System.out.println("오리(" + this.name + ")는 소리내어 웁니다.");
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "오리의 이름은 " + this.name + " 입니다.";
  }
}
