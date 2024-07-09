package objectEx.prob01;

import java.util.Objects;

public class Owner {
  private String name;
  private String cellPhone;

  public Owner(String name, String cellPhone) {
    this.name = name;
    this.cellPhone = cellPhone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if(!(o instanceof Owner owner)) {
      return false;
    }
    return Objects.equals(name, owner.name);
  }

  @Override
  public String toString() {
    return "이름은 " + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다.";
  }
}
