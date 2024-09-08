public class Wall {
    // write code here
    // fields
    private double width;
    private double height;
    
    
    // constructors
    public Wall() {}
    
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0d;
        }
        else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0d;
        }
        else {
            this.height = height;
        }
    }
    
    
    // methods
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double x) {
        if (x < 0) {
            this.width = 0d;
        }
        else {
            this.width = x;
        }
    }
    
    public void setHeight(double x) {
        if (x < 0) {
            this.height = 0d;
        }
        else {
            this.height = x;
        }
    }
    
    public double getArea() {
        return (this.width * this.height);
    }
    
    
}
