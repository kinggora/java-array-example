package inheritance.prob01;

public class Drink {
  protected String name;
  protected int price;
  protected int count;

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getTotalPrice() {
    return price * count;
  }

  public static void printTitle() {
    System.out.println("상품명\t\t단가\t\t수량\t\t금액");
  }


  public void printData() {
    System.out.printf("%s\t\t%d\t\t%d\t\t\t\t%d\n", name, price, count, getTotalPrice());
  }
}
