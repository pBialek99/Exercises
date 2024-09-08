public class ComplexNumber {
    // write code here
    // fields
    private double real;
    private double imaginary;

    
    // constructors
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    
    // methods
    public double getReal() {
        return real;
    }
    
    public double getImaginary() {
        return imaginary;
    }
    
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    
    public void add(ComplexNumber x) {
        this.real += x.real;
        this.imaginary += x.imaginary;
    }
    
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    
    public void subtract(ComplexNumber x) {
        this.real -= x.real;
        this.imaginary -= x.imaginary;
    }
    

    
    
    
    
    
    
    
}
