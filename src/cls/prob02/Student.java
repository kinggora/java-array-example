package cls.prob02;

public class Student {
  private String name;
  private int age;
  private int id;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void print() {
    System.out.println("이  름 : " + getName() + "    나  이 : " + getAge() + "    학  번 : " + getId());
  }
}
