package interfaceEx.prob02;

public class TVFactory extends Factory implements IWorkingTogether {

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int makeProducts(char skill) {
    int skillLevel = 1;
    switch (skill) {
      case 'A' -> {
        skillLevel = 8;
      }
      case 'B' -> {
        skillLevel = 5;
      }
      case 'C' -> {
        skillLevel = 3;
      }
    }
    return skillLevel * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    int products = 0;
    if (partner instanceof Factory) {
      products =  ((Factory) partner).makeProducts('C');
    }
    return products;
  }
}
