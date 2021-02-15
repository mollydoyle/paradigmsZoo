// Animal class 
public abstract class Animal {

    // properties
    String name;
    int age;

    // constructor
    public Animal(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // behavior 
    public final void exist() {
	  	System.out.print("He exists in the zoo. "); 
	  }

    public abstract void move();
    public abstract void display();
}
