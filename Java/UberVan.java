import java.util.Map;

class UberVan extends Car {
  Map<String, Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  private Integer passegenger;

  // public UberVan(String license, Account driver, Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
  public UberVan(String license, Account driver){
    super(license, driver);
    // this.typeCarAccepted = typeCarAccepted
    // this.seatsMaterial = seatsMaterial
  }

  @Override
  public void setPassegenger(Integer passegenger){
    if(passegenger == 6){
      this.passegenger = passegenger;
    }else{
      System.out.println("Necesitas asignar 6 pasajeros");
    }
  }

}