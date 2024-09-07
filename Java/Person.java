public class Person {
    // write code here
    private String firstName;
    private String lastName;
    private int age;
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setFirstName(String x) {
        this.firstName = x;
    }
    
    public void setLastName(String x) {
        this.lastName = x;
    }
    
    public void setAge(int x) {
        if (x < 0 || x > 100) {
            this.age = 0;
        }
        else {
            this.age = x;
        }
    }
    
    public boolean isTeen() {
        return (age > 12 && age < 20) ? true : false;
    }
    
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        else if (lastName.isEmpty()) {
            return firstName;
        }
        else if (firstName.isEmpty()) {
            return lastName;
        }
        else {
            return (firstName + " " + lastName);
        }
    }
}
