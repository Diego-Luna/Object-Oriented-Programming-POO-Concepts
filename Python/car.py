from account import Account

class Car:
  id            = int
  licence       = str
  driver        = str
  passegenger   = str

  def __init__(self, license, driver):
      self.licence  = license
      self.driver   = driver