public class CylinderExercise {
  
  public class Circle {
    // write code here
    // fields
    private double radius;
    
    
    // constructors
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }
    
    
    // methods
    public double getRadius() {
        return this.radius;
    }
    
    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }
  }

  public class Cylinder extends Circle {
    // write code here
    // fields
    private double height;
    
    
    // constructors
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }
    
    
    // methods
    public double getHeight() {
        return this.height;
    }
    
    public double getVolume() {
        return (this.getArea() * this.height);
    }
  }
}
