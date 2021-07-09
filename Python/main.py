from car import Car
from account import Account

if __name__ == "__main__":
  print("Hola Mundo")

  car = Car("AMS234", Account("Luke Castellan", "LC876"))
  print(vars(car))
  print(vars(car.driver))

# if __name__ == "__main__":
#   print("Hola mundo");
#   car = Car();
#   car.licence = "AMS123"
#   car.driver = "Diego Luna"
#   print(vars(car))

#   car2 = Car();
#   car2.licence = "AMS123"
#   car2.driver = "Piper MC"
#   print(vars(car2))