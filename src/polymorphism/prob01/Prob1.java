package polymorphism.prob01;

public class Prob1 {
  public static void main(String[] args) {
    Wheeler bike = new Bike("자전거", 0, 2);
    Wheeler truck = new Truck("트럭", 0, 4);
    System.out.printf("%s : 바퀴 %d개입니다\n", truck.carName, truck.wheelNumber);
    System.out.printf("%s : 바퀴 %d개입니다\n", bike.carName, bike.wheelNumber);
    truck.speedUp(20);
    bike.speedUp(25);
    truck.speedDown(15);
    bike.speedDown(20);
    truck.stop();
    bike.stop();
    truck.speedUp(10);
  }
}
