package cls.prob03;

public class Emp {

  private String id;
  private String name;
  private int baseSalary;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBaseSalary() {
    return this.baseSalary;
  }

  public void setBaseSalary(int baseSalary) {
    this.baseSalary = baseSalary;
  }

  public double getSalary(double bonus) {
    return this.baseSalary + this.baseSalary * bonus;
  }

  @Override
  public String toString() {
    return this.name + "(" + this.id + ") 사원의 기본급은 " + this.baseSalary + "원 입니다.";
  }
}
