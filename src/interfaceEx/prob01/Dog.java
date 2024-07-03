package interfaceEx.prob01;

public class Dog extends Animal{

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    distance += speed * (hours / 2.0);
  }

}
