class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){        //constructor , because it has same name as parent class
        super(message);        //Communicates with super/parent class to get message
    }
}

class BankAccount{
    double balance = 5000;         //instance variable (double)

    void withdraw(double amount) throws InsufficientBalanceException{      //inbuilt (throws). Used for multiple exceptions.
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient balance ");     //User defined(throw new)
        }

    balance -= amount;
    System.out.println("withdraw successful");
    }
}

public class Combine_Demo {
    public static void main(String[] args) {
       try {
        int x = 10/0;
       } catch (Exception e) {
        System.out.println("error");
       }

       BankAccount account = new BankAccount();
       try{
        account.withdraw(7000);
       } catch (Exception e) {
        System.out.println("custom error "+e.getMessage());         //e.getMessage is used to get the error message
       }
       System.out.println("successful");
    }
}
