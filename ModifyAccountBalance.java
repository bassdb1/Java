// Implement the TODOs inside the BankAccount class
class BankAccount {
    Integer accountBalance = 0;
  
    public void depositFunds(Integer amount){
      // TODO: increase the property `accountBalance` by the `amount`
      accountBalance = amount;
    }
  
    public void withdrawFunds(Integer amount){
      // TODO: decrease the property `accountBalance` by the `amount`
      accountBalance = accountBalance - amount;
    }
  }
  
  // Do not change the code below this line.
  public class Main {
    public static void main(String args[]){
  
      BankAccount checkingAccount = new BankAccount();
      checkingAccount.depositFunds(300);
      checkingAccount.withdrawFunds(200);
  
      // This should print "100" - the total amount after
      // depositing 300 and withdrawing 200.
  
      System.out.println(checkingAccount.accountBalance);
    }
  }
  