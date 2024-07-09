package objectEx.prob01;

import java.util.Objects;

public class Vehicle {
  private Owner owner;
  private int price;

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Vehicle vehicle)) {
      return false;
    }
    return Objects.equals(owner, vehicle.owner);
  }

  @Override
  public String toString() {;
    return "소유주정보: " + this.owner + "\n차량정보 : 가격은 " + price + "입니다.";
  }
}
