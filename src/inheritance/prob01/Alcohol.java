package inheritance.prob01;

public class Alcohol extends Drink {

  private double alcper;

  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }

  public static void printTitle() {
    System.out.println("상품명(도수[%])\t\t단가\t\t수량\t\t금액");
  }

  public void printData() {
    System.out.printf("%s(%.1f)\t\t\t\t%d\t\t%d\t\t\t\t%d\n", super.name, this.alcper, super.price, super.count, getTotalPrice());
  }
}
