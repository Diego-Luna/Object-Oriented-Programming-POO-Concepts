class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    UberX uberX = new UberX("AMQ321", new Account("Andres Herrera", "AND123" ), "Chevrolet", "Sonic" );
    uberX.setPassegenger(4);
    uberX.printDataCar();

    // Car car2 = new Car("ABC346", new Account("Hazel Herrera", "HH123") );
    // car2.passegenger = 2;
    // car2.printDataCar();

  }
}