public class Reptile extends Animal {

    // properties
    double speed;
	string favoriteFood; 

    // constructor
    public Reptile(double speed, string favoriteFood) {
      this.speed = speed;
	  this.favoriteFood = favoriteFood; 
    }

    // behavior 
    public void favoriteFood(string favoriteFood ) {
		this.favoriteFood = favoriteFood; 
	}

	public void speed(double speed){
		this.speed = speed; 
	}
}
