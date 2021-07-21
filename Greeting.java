class Greeting {
    public String helloThere(String personName){
      return "Hello " + personName + "!";
    }
  }
  
  public class Main {
      public static void main(String[] args){
        Greeting greeting = new Greeting();
        String message = greeting.helloThere("Bob");
        System.out.println(message);
      }
  }
  