// BankAccount Class
class BankAccount {
    // BankAccount 'formattedBalance' Method
    public String formattedBalance(){
        // formattedBalance' Method Variables
      Integer accountBalance = 995;
      String accountName = "Checking Account";
      // formattedBalance' Method will return
      return accountName + ": $" + accountBalance;
    }
  }

  // Main Class
  public class Main {

    // Main method 'main'
      public static void main(String[] args){
        // Making a new object/instance 'bankAccount' from the 'BankAccount class'
        BankAccount bankAccount = new BankAccount();
        // Calling the new object 'bankAccount' and the 'BankAccount Class' Method, formattedBalance
        // .. then printing out the output 
        System.out.println(bankAccount.formattedBalance());
      }
  }
  