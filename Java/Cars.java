public class Cars {

  public class Car {
    // write code here
    // fields
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    
    // constructors
    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }
    
    
    // methods
    public String startEngine() {
        return "Car -> engine started";
    }
    
    public String accelerate() {
        return "Car -> is accelerating";
    }
    
    public String brake() {
        return "Car -> is braking";
    }
    
    public int getCylinders() {
        return this.cylinders;
    }
    
    public String getName() {
        return this.name;
    }
  }

  // ---------------------------
  public class Mitsubishi extends Car{
    // write code here
    // constructors
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    
    // methods
    public String startEngine() {
        return "Mitsubishi -> engine started";
    }
    
    public String accelerate() {
        return "Mitsubishi -> is accelerating";
    }
    
    public String brake() {
        return "Mitsubishi -> is braking";
    }
  }

  // ---------------------------
  public class Holden extends Car {
    // write code here
    // constructors
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    
    
    // methods
    public String startEngine() {
        return "Holden -> engine started";
    }
    
    public String accelerate() {
        return "Holden -> is accelerating";
    }
    
    public String brake() {
        return "Holden -> is braking";
    }
  }

  // ---------------------------
  public class Ford extends Car{
    // write code here
    // constructors
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    
    
    // methods
    public String startEngine() {
        return "Ford -> engine started";
    }
    
    public String accelerate() {
        return "Ford -> is accelerating";
    }
    
    public String brake() {
        return "Ford -> is braking";
    }
  }
}
