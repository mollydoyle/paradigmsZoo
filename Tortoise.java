public class Tortoise extends Reptile {

    // properties 
    double shellDiameter;
	boolean canHideInShell; 



      // constructor

      Tortoise(double speed, string favoriteFood, double shellDiameter, boolean canHideInShell) {
		super(speed, favoriteFood, shellDiameter, canHideInShell); 
        this.shellDiameter = shellDiameter;
		this.color = color; 

      }

      // behavior 
      public void canHideInShell(boolean canHideInShell) {
	  	if(canHideInsShell){
			System.out.println("He can hide in his shell."); 
		}
		else{
			System.out.println("He does not hide in his shell."); 
		}
	  
	  }

	  public void shellDiameter(double shellDiameter){
		  System.out.println("His shell is " + shellDiameter + " inches wide."); 
		 }

	  public void display(){
		  System.out.println(this.name + " is a Tortoise."); 
		  System.out.println("He is " + this.age + " years old."); 
		  System.out.println("He moves at a rate of " + this.speed + " miles per hours."); 
		  System.out.println("His favorite food is " + this.favoriteFood + "."); 
		  canHideInShell(canHideInShell); 
		  shellDiameter(shellDiameter); 
	  }

}
