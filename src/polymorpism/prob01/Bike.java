package polymorpism.prob01;

public class Bike extends Wheeler{

  public Bike(String carName, int velocity, int wheelNumber) {
    super();
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    int maxVelocity = 40;
    if(this.velocity + speed > maxVelocity) {
      this.velocity = maxVelocity;
      System.out.printf("%s의 최고속도위반으로 속도를 %d 으로 내립니다.\n", carName, maxVelocity);
    } else {
      this.velocity += speed;
      System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }
  }

  @Override
  public void speedDown(int speed) {
    int minVelocity = 10;
    if(this.velocity - speed < minVelocity) {
      this.velocity = minVelocity;
      System.out.printf("%s의 최저속도위반으로 속도를 %d 으로 올립니다.\n", carName, minVelocity);
    } else {
      this.velocity -= speed;
      System.out.printf("%s의 현재 속도는 %d 입니다.\n", carName, velocity);
    }
  }
}
