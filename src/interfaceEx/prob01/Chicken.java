package interfaceEx.prob01;

public class Chicken extends Animal implements Cheatable{

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    distance += speed * hours;
  }

  @Override
  public void fly() {
    speed = 2 * speed;
  }
}
