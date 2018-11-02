public class SavingsAccount extends Accounts{

//Set of Properties;
    int accountNumber; //is this needed in every Account?
    private double balance;
    private final double savingsInterestRate = 1.5;
    private String status;
    private double myInterest;


    //This is the constructor
    public SavingsAccount(double balance,int accountNumber) {
        this.balance = balance;
        this.accountNumber=accountNumber;
    }

    @Override
    public double calculateInterest() {
       this.myInterest = (savingsInterestRate/100) * balance;

        return myInterest;
    }

    //
    @Override
    public double checkBalance() {

        return balance;
    }

    @Override
    public String transferMoney() {

        if (Math.random()>0.50)
            status="Complete";
        else
           status="Unable to transfer Money";
        return status;
    }

    @Override
    public double withdraw() {
        return super.withdraw();
    }




}
