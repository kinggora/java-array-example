package polymorpism.prob02;

public class Rectangular extends Shape{

  private double width;
  private double height;

  public Rectangular(double width, double height) {
    super("직사각형");
    this.width = width;
    this.height = height;
  }

  @Override
  public void calculationArea() {
    this.area = width * height;
  }

}
