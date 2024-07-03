package interfaceEx.prob02;

public class CarFactory extends Factory implements IWorkingTogether{

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    int skillLevel = 0;
    switch (skill) {
      case 'A' -> {
        skillLevel = 3;
      }
      case 'B' -> {
        skillLevel = 2;
      }
      case 'C' -> {
        skillLevel = 1;
      }
    }
    return skillLevel * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    int products = 0;
    if (partner instanceof Factory) {
      products =  ((Factory) partner).makeProducts('B');
    }
    return products;
  }
}
