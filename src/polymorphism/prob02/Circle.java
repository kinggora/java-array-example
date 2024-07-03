package polymorphism.prob02;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    super("원");
    this.radius = radius;
  }

  @Override
  public void calculationArea() {
    this.area = this.radius * this.radius * Math.PI;
  }
}
