package polymorpism.prob03;

public class Coffee extends Beverage{

  static int amount = 0;

  public Coffee(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (getName()) {
      case "Americano": {
        this.price = 1500;
        break;
      }
      case "CafeLatte" : {
        this.price = 2500;
        break;
      }
      case "Cappuccino" : {
        this.price = 3000;
        break;
      }
    }
  }
}
