package polymorpism.prob03;

public abstract class Beverage {
  private String name;
  protected int price;

  public Beverage(String name) {
    this.name = name;
  }

  public abstract void calcPrice();

  public void print() {

  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}
