package com.gana.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		private int transactionid;
		@Column
		private int transactionnum;
		@Column
		private int transactiondate;
		@Column
		private int transactionamount;
		@Column
		private int transactionmethod;
		@Column
		private int transactionerid;
		@Column
		private int transactiontotal;
		public Transaction() {
			super();
			
		}
		public Transaction(int transactionid, int transactionnum, int transactiondate, int transactionamount,
				int transactionmethod, int transactionerid, int transactiontotal) {
			super();
			this.transactionid = transactionid;
			this.transactionnum = transactionnum;
			this.transactiondate = transactiondate;
			this.transactionamount = transactionamount;
			this.transactionmethod = transactionmethod;
			this.transactionerid = transactionerid;
			this.transactiontotal = transactiontotal;
		}
		public int getTransactionid() {
			return transactionid;
		}
		public void setTransactionid(int transactionid) {
			this.transactionid = transactionid;
		}
		public int getTransactionnum() {
			return transactionnum;
		}
		public void setTransactionnum(int transactionnum) {
			this.transactionnum = transactionnum;
		}
		public int getTransactiondate() {
			return transactiondate;
		}
		public void setTransactiondate(int transactiondate) {
			this.transactiondate = transactiondate;
		}
		public int getTransactionamount() {
			return transactionamount;
		}
		public void setTransactionamount(int transactionamount) {
			this.transactionamount = transactionamount;
		}
		public int getTransactionmethod() {
			return transactionmethod;
		}
		public void setTransactionmethod(int transactionmethod) {
			this.transactionmethod = transactionmethod;
		}
		public int getTransactionerid() {
			return transactionerid;
		}
		public void setTransactionerid(int transactionerid) {
			this.transactionerid = transactionerid;
		}
		public int getTransactiontotal() {
			return transactiontotal;
		}
		public void setTransactiontotal(int transactiontotal) {
			this.transactiontotal = transactiontotal;
		}
		@Override
		public String toString() {
			return "Transaction [transactionid=" + transactionid + ", transactionnum=" + transactionnum
					+ ", transactiondate=" + transactiondate + ", transactionamount=" + transactionamount
					+ ", transactionmethod=" + transactionmethod + ", transactionerid=" + transactionerid
					+ ", transactiontotal=" + transactiontotal + "]";
		}
		
		
}
