public class BankAccount {
  private double acNum;
  private double balance;
  private String email;
  private int phoneNumber;

  public BankAccount(){
    this(12345, 0.00, "null", 123456789);
    System.out.println("Empty constructor called");
  }

  public BankAccount(double acNum, double balance, String email, int phoneNumber) {
    this.acNum = acNum;
    this.balance = balance;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public void deposit(double depositAmount){
    this.balance += depositAmount;
    System.out.println("Deposit of " + depositAmount +" successful. Your current balance is " + this.balance);
  }

  public void withdrawal(double withdrawalAmount){
    if(this.balance - withdrawalAmount < 0){
      System.out.println("You have too little in your account: " + this.balance);
    }
    else {
      this.balance -= withdrawalAmount;
      System.out.println("Withdrawal of " + withdrawalAmount + " success. Your remaining balance is " + this.balance);
    }
  }

  public void setAcNum(double acNum){
    this.acNum = acNum;
  }
  public double getAcNum(){
    return this.acNum;
  }

  public void setBalance(double balance){
    this.balance = balance;
  }
  public double getBalance(){
    return this.balance;
  }

  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return this.email;
  }

  public void setPhoneNumber(int phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  public int getPhoneNumber(){
    return this.phoneNumber;
  }
}
