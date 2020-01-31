public class BankAccountGetSet {
  public static void main(String[] args){
    BankAccount bobsAccount = new BankAccount(12345.0, 0.00, "null", 0);

    bobsAccount.deposit(125);
    bobsAccount.withdrawal(25.15);

    System.out.println("You now have " + bobsAccount.getBalance());

    VipCustomer Person1 = new VipCustomer();
    System.out.println("The name is " + Person1.getName());

    VipCustomer Person2 = new VipCustomer("Greg", 2000);
    System.out.println("Person2 is named " + Person2.getName());

  }
}
