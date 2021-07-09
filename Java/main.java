class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    Car car = new Car("AMQ321", new Account("Andres Herrera", "AND123" ) );
    car.passegenger = 4;
    car.printDataCar();

    Car car2 = new Car("ABC346", new Account("Hazel Herrera", "HH123") );
    car2.passegenger = 2;
    car2.printDataCar();

  }
}