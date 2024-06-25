package cls.prob02;

public class Teacher {
  private String name;
  private int age;
  private String subject;

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

  public String getSubject() {
    return this.subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void print() {
    System.out.println("이  름 : " + getName() + "    나  이 : " + getAge() + "    담당과목 : " + getSubject());
  }
}
