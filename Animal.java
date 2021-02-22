// Animal class 
public abstract class Animal {

    // properties
    String name;
    int age;

    // constructor
    protected Animal(String name, int age) {
      this.name = name;
      this.age = age;
    }

    protected Animal(String name) {
      this.name = name;
    }

    // behavior 
    public final void exist() {
	  	System.out.print("He exists in the zoo. "); 
	  }

    public String getAnimalName() {
      return name;
    }

    public abstract void specialProperty();
    public abstract void move();
    public abstract void display();
}
