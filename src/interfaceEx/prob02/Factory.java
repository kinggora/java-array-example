package interfaceEx.prob02;

public abstract class Factory {
  int openHour;
  int closeHour;
  String name;

  Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return name;
  }

  public int getWorkingTime() {
    return closeHour - openHour;
  }

  abstract int makeProducts(char skill);
}
