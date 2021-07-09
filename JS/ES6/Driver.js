class Driver extends Account {
  constructor(name, document, email, password){
    super(name, document, email, password)
  }

  printDataDriver(){
    console.log("Name: " + this.name);
    console.log("Document: " + this.Document);
    console.log("Email: " + this.Email);
    console.log("Password: " + this.Password);
  }

}