public class CheckingAccount  extends Accounts {

    private String status;
    private final double interestRate = 05;
    private double balance;
    private double myInterest;
    private int accountNumber;


    public CheckingAccount(double balance,int accountNumber) {
        this.balance = balance;
        this.accountNumber=accountNumber;
    }



    @Override
    public double checkBalance()
    {
        return balance;
    }

    @Override
        public double calculateInterest() {
            this.myInterest = (interestRate / 100) * balance;
            return myInterest;
        }


        @Override
        public String transferMoney() {
            if (Math.random() > 0.90)
                this.status = "Complete";
            else
                this.status = "Unable to transfer Money";
            return status;
        }

        @Override
        public double withdraw() {
            return super.withdraw();
        }


    }
