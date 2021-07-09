class User extends Account {
  constructor(name, document, email, password){
    super(name, document, email, password)
  }

  printDataUser(){
    console.log("Name: " + this.name);
    console.log("Document: " + this.Document);
    console.log("Email: " + this.Email);
    console.log("Password: " + this.Password);
  }

}