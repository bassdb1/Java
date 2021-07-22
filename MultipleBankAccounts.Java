
// Main Class
public class Main {
    // 'main' Method
    public static void main(String[] args){
        // Making a 'bankAccountOne' Object using 'BankAccount Class'
      BankAccount bankAccountOne = new BankAccount();
        // bankAccountOne property
      bankAccountOne.balance = 500;

        // Making a 'bankAccountTwo' Object using 'BankAccount Class'
      BankAccount bankAccountTwo = new BankAccount();
        // bankAccountTwo property
      bankAccountTwo.balance = -50;

         // Making a 'bankAccountThree' Object using 'BankAccount Class'

      BankAccount bankAccountThree = new BankAccount();
       // bankAccountThree property
      bankAccountThree.balance = 253;

        //Printing out bankAccountOne' Object information

      System.out.println("bankAccountOne.balance: " + bankAccountOne.balance);

      //Printing out bankAccountTwo' Object information
      System.out.println("bankAccountTwo.balance: " + bankAccountTwo.balance);

      //Printing out bankAccountThree' Object information

      System.out.println("bankAccountThree.balance: " + bankAccountThree.balance);
    }
}

    // BankAccount Class
class BankAccount{
  Integer balance = 0;
}
