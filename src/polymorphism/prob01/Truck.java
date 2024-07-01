package polymorphism.prob01;

public class Truck extends Wheeler{

  public Truck(String carName, int velocity, int wheelNumber) {
    super();
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    int maxVelocity = 100;
    if(this.velocity + speed * 5 > maxVelocity) {
      this.velocity = maxVelocity;
      System.out.printf("%s의 최고속도위반으로 속도를 %d 으로 내립니다.\n", carName, maxVelocity);
    } else {
      this.velocity += speed * 5;
      System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }
  }

  @Override
  public void speedDown(int speed) {
    int minVelocity = 50;
    if(this.velocity - speed * 5 < minVelocity) {
      this.velocity = minVelocity;
      System.out.printf("%s의 최저속도위반으로 속도를 %d 으로 올립니다.\n", carName, minVelocity);
    } else {
      this.velocity -= speed * 5;
      System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }
  }
}
