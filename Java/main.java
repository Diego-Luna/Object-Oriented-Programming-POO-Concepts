class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    Car car = new Car();
    car.licence = "AMQ321";
    car.driver = "Andres Herrera";
    car.passegenger = 4;
    car.printDataCar();

    Car car2 = new Car();
    car2.licence = "ABC346";
    car2.driver = "Hazel Herrera";
    car2.passegenger = 2;
    car2.printDataCar();

  }
}