// Two Specific Fish

public class Dog extends Mammal {
  // properties 
  String breed;

  // constructor
  Dog(String name, int age, boolean isAquatic, String breed) {
    super(name, age, isAquatic);
    this.breed = breed;
  }

  //behavior
  public void pant(){
    System.out.print("He pants when tired. ");
  }

  public void speak(){
    System.out.print("He makes a bark sound. ");
  }
  
  public void move(){
    System.out.print("He walks on four legs. ");
  }

  public void display() {
    System.out.print(this.name + " is a Dog. "); 
		System.out.print("He is " + this.age + " years old. ");
    exist();
    move();
    if(isAquatic) {
      System.out.print("He is an aquatic mammal. ");
    }
    else {
      System.out.print("He is not an aquatic mammal. ");
    }
    this.speak();
    System.out.print("He is a " + this.breed + "breed of dog. "); 
    this.pant();
    System.out.println("\n");
  }
}
