// Animal class 
public class Animal {

    // properties
    String name;
    int age;
	boolean doesItExist; 
	boolean doesItMove; 

    // constructor
    public Animal(String name, int age, boolean doesItExist, boolean doesItMove) {
      this.name = name;
      this.age = age;
	  this.doesItExist = doesItExist; 

    }

      // behavior 
      public boolean exist() {
	  	return doesItExist; 
	  }


      public boolean move() {
	  	return doesItMove; 
	  }

	  public abstract void display(); 
}
