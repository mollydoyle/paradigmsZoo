public abstract class Reptile extends Animal {

    // properties
    double speed;

    // constructor
    public Reptile(String name, int age, double speed) {
      super(name, age);
      this.speed = speed;
    }

    // behavior 
    public abstract void favoriteFood();
}
