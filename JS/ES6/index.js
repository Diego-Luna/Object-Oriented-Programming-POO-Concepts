var car = new Car("AW426", new Account("Calipso Valdes", "QWE132"));

car.passenger = 4;
car.printDataCar();

console.log("-------------------");

var uberX = new UberX(
  "AW426",
  new Account("Calipso Valdes", "QWE132"),
  "Chevrolet",
  "spark"
);

uberX.passenger = 4;
uberX.printDataCar();