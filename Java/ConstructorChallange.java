public class ConstructorChallange {
  public class Customer {

    // fields
    private String name;
    private int creditLimit;
    private String emailAddress;

    
    // getters
    public String getName() {
      return name;
    }

    public String getEmailAddress() {
      return emailAddress;
    }
    
    public int getCreditLimit() {
      return creditLimit;
    }

    
    // constructors
    public Customer(String name, String emailAddress, int creditLimit) {
      this.name = name;
      this.emailAddress = emailAddress;
      this.creditLimit = creditLimit;
    }

    public Customer() {
      this("Andrzej", "kolibka123@samplemail.com", 300);
    }
    
    public Customer(String name, String emailAddress) {
      this(name, emailAddress, 350);
    }
  }
}
