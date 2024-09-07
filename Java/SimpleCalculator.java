public class SimpleCalculator {
    // write code here
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber() {
        return firstNumber;
    }
    
    public double getSecondNumber() {
        return secondNumber;
    }
    
    public void setFirstNumber(double x) {
        this.firstNumber = x;
    }
    
    public void setSecondNumber(double x) {
        this.secondNumber = x;
    }
    
    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }
    
    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }
    
    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }
    
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0d;
        }
        else {
            return (firstNumber / secondNumber);
        }
            
    }
}
