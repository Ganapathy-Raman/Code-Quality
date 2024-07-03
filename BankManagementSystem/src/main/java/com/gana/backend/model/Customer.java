package com.gana.backend.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int customerid;
		@Column
		private String customername;
		@Column
		private String customerage;
		@Column
		private String customeraddress;
		@Column
		private String customergender;
//		@PrimaryKeyJoinColumn
		
		@OneToOne(targetEntity = Transaction.class,cascade = CascadeType.ALL)
		@JoinColumn(name = "Transaction")
		private Transaction transaction;

		public Customer() {
			super();
			
		}

		public Customer(int customerid, String customername, String customerage, String customeraddress,
				String customergender, Transaction transaction) {
			super();
			this.customerid = customerid;
			this.customername = customername;
			this.customerage = customerage;
			this.customeraddress = customeraddress;
			this.customergender = customergender;
			this.transaction = transaction;
		}

		public int getCustomerid() {
			return customerid;
		}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public String getCustomerage() {
			return customerage;
		}

		public void setCustomerage(String customerage) {
			this.customerage = customerage;
		}

		public String getCustomeraddress() {
			return customeraddress;
		}

		public void setCustomeraddress(String customeraddress) {
			this.customeraddress = customeraddress;
		}

		public String getCustomergender() {
			return customergender;
		}

		public void setCustomergender(String customergender) {
			this.customergender = customergender;
		}

		public Transaction getTransaction() {
			return transaction;
		}

		public void setTransaction(Transaction transaction) {
			this.transaction = transaction;
		}

		@Override
		public String toString() {
			return "Customer [customerid=" + customerid + ", customername=" + customername + ", customerage="
					+ customerage + ", customeraddress=" + customeraddress + ", customergender=" + customergender
					+ ", transaction=" + transaction + "]";
		}

		
		
		


}
