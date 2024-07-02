package polymorpism.prob03;

public class Tea extends Beverage{

  static int amount;

  public Tea(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (getName()) {
      case "lemonTea": {
        this.price = 1500;
        break;
      }
      case "ginsengTea" : {
        this.price = 2000;
        break;
      }
      case "redginsengTea" : {
        this.price = 2500;
        break;
      }
    }
  }
}