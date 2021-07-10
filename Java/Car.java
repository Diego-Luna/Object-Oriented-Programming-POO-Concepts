class Account {
  Integer id;
  String license;
  Account driver;
  private Integer passegenger;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
  }

  void printDataCar(){
    if(passegenger != null ){
      System.out.println("License: " + license + " Driver: " + driver.name + " Passegenger: " + passegenger );
    }
  }

  public Integer getPassegenger(){
    return passegenger;
  }

  public void setPassegenger(Integer passegenger){
    if(passegenger == 4){
      this.passegenger = passegenger;
    }else{
      System.out.println("Necesitas asignar 4 pasajeros");
    }
  }

}