from car import Car

if __name__ == "__main__":
  print("Hola mundo");
  car = Car();
  car.licence = "AMS123"
  car.driver = "Diego Luna"
  print(vars(car))

  car2 = Car();
  car2.licence = "AMS123"
  car2.driver = "Piper MC"
  print(vars(car2))