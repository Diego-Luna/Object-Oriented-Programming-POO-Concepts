class Main {
  public static void main(String[] args) {
    System.out.println("Hola mundo");
    UberX uberX = new UberX("AMQ321", new Account("Andres Herrera", "AND123" ), "Chevrolet", "Sonic" );
    uberX.setPassegenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("ABC346", new Account("Hazel Herrera", "HH123") );
    uberVan.setPassegenger(6);
    uberVan.printDataCar();

  }
}