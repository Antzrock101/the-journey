public class Bank {


    //Properties a bank can have
    private String bankName;
    private String bankAddress;



    //does Bank need any methods???





    //Constructor called when creating a new bank
    public Bank(String bankName, String bankAddress) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
    }


    // Getters to retrieve bankName and bank address
    public String getBankName() {
        return bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }





}
