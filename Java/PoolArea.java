public class PoolArea {

  public class Rectangle {
    // write code here
    // fields
    private double width;
    private double length;
    
    
    // constructors
    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }
    
    
    // methods
    public double getWidth() {
        return this.width;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public double getArea() {
        return (this.width * this.length);
    }
  }

  public class Cuboid extends Rectangle {
    // write code here
    // fields
    private double height;
    
    
    // constructors
    public Cuboid(double width, double length, double height) {
        super(width, length);
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
