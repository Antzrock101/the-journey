public class Customer {

    //Properties

      private String firstName;
      private String lastName;
      private String Address;
      private int phoneNumber;
      private int accountNumber;

      public int getAccountNumber() {
            this.accountNumber =accountNumber;
            return accountNumber;
      }
      //constructor


      public Customer(String firstName, String lastName, String address, int phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.Address = address;
            this.phoneNumber = phoneNumber;
      }

      //


      public String getFirstName() {
            return firstName;
      }

      public String getLastName() {
            return lastName;
      }

      public String getAddress() {
            return Address;
      }

      public int getPhoneNumber() {
            return phoneNumber;
      }



}
