public class FloorCarpetCalculator {
  
  public class Floor {
    // write code here
    // fields
    private double width;
    private double length;
    
    
    // constructors
    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }
    
    
    // methods
    public double getArea() {
        return (this.width * this.length);
    }
  }

  public class Carpet {
    // fields
    private double cost;
    
    
    // constructors
    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }
    
    
    // methods    
    public double getCost() {
        return this.cost;
    }  
  }

  public class Calculator {
    // fields
    private Carpet carpet;
    private Floor floor;
    
    // costructors
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }
    
    // methods
    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
  }
}
