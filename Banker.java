public class Banker {
    public static void main(String[] args) {


        Customer customer = new Customer("Ashish"," Chhetry","Dallas",551221638);


        System.out.println("Customer info is "+ customer.getFirstName()+ customer.getLastName()+"   "+ customer.getPhoneNumber() + customer.getAccountNumber());
        System.out.println();

        Accounts check1 = new CheckingAccount(10000.50,1);

        Accounts saving1 = new SavingsAccount(2000,2);


        System.out.println("Interest Earned : "+ check1.calculateInterest());
        System.out.println("Interest Earned : "+ saving1.calculateInterest());
        System.out.println();

        System.out.println("My Balance is : "+ check1.checkBalance());

        System.out.println("My Balance is : "+ saving1.checkBalance());

        System.out.println();

        System.out.println("Transfer Money status : "+ check1.transferMoney());
        System.out.println("Transfer Money status : "+ saving1.transferMoney());


        System.out.println("Withdraw "+ check1.withdraw());


    }

}
