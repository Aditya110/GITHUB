package droolsTest;

import java.io.Serializable;

public class AccountDetailsResponseBO implements Serializable{

		private String accountNumber;
		private String customerID;
		private String balance;
		private String accountType;
		
		public AccountDetailsResponseBO(String accountNumber, String customerID, String balance, String accountType){
			super();
			this.accountNumber = accountNumber;
			this.customerID = customerID;
			this.balance = balance;
			this.accountType = accountType;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getCustomerID() {
			return customerID;
		}

		public void setCustomerID(String customerID) {
			this.customerID = customerID;
		}

		public String getBalance() {
			return balance;
		}

		public void setBalance(String balance) {
			this.balance = balance;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		
		@Override
		public String toString(){
			return "AccountDetailsResponseBO[accountNumber= " + accountNumber 
					+", customerID= " + customerID 
					+", balance= "+ balance
					+", accountType= "+ accountType +"]";
		}		
}
