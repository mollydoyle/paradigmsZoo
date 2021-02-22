public class Tortoise extends Reptile {

    // properties 
    double shellDiameter;

    // constructor
    Tortoise(String name, int age, double speed, double shellDiameter) {
		  super(name, age, speed); 
      this.shellDiameter = shellDiameter;
		}
		
		Tortoise(String name, double shellDiameter) {
			super(name);
			this.shellDiameter = shellDiameter;
		}

		public void specialProperty() {
			System.out.print("has a shell that is " + shellDiameter + " inches wide. ");
		}

    // behavior 
		public void move(){
			System.out.print("He walks very, very slowly. ");
		}
		
		public void favoriteFood(){
			System.out.print("His favorite food is collard greens. ");
		}
		
    public void hideInShell() {
			System.out.print("He can hide in his shell. "); 
	  }

	  public void shellDiameter(){
		  System.out.print("His shell is " + shellDiameter + " inches wide. "); 
		 }

	  public void display(){
		  System.out.print(this.name + " is a Tortoise. "); 
		  System.out.print("He is " + this.age + " years old. ");
			exist();
			move();
		  System.out.print("He moves at a rate of " + this.speed + " miles per hours. "); 
		  favoriteFood();
		  shellDiameter();
			hideInShell();
			System.out.println("\n");
	  }
}
