public abstract class Reptile extends Animal {

    // properties
    double speed;

    // constructor
    protected Reptile(String name, int age, double speed) {
      super(name, age);
      this.speed = speed;
    }

    protected Reptile(String name) {
      super(name);
    }

    // behavior 
    public abstract void favoriteFood();
}
