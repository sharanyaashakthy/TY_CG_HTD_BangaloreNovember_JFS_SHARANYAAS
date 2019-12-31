package com.capgemini.forestrymanagementsystemjdbc.bean;

public class CustomerBean  {
	
		private int customerId;
		private String customerName;
		private String address1;
		private String address2;
		private String town;
		private int postalCode;
		private String email;
		private long mobileNumber;
		
	
		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public String getAddress1() {
			return address1;
		}


		public void setAddress1(String address1) {
			this.address1 = address1;
		}


		public String getAddress2() {
			return address2;
		}


		public void setAddress2(String address2) {
			this.address2 = address2;
		}


		public String getTown() {
			return town;
		}


		public void setTown(String town) {
			this.town = town;
		}


		public int getPostalCode() {
			return postalCode;
		}


		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public long getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		@Override
		public String toString() {
			return "CustomerBean [customerId=" + customerId + ", customerName=" + customerName + ", address1=" + address1
					+ ", address2=" + address2 + ", town=" + town + ", postalCode=" + postalCode + ", email=" + email
					+ ", mobileNumber=" + mobileNumber + "]";
		}
		
		
		

}
