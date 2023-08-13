package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="transactions")

public class Transaction extends BaseEntity {
	
	 @Column(name = "user_name")
	    private String userName;
	 
	 @Column(unique = true,length=30)
	    private String email;

	    @Column(name = "bus_name")
	    private String busName;

	    @Column(name = "no_of_seat")
	    private int noOfSeat;

	    private double price;

	    private double total;

	    private LocalDate date;
	    
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Transaction(String userName, String email, String busName, int noOfSeat, double price, double total,
			LocalDate date) {
		super();
		this.userName = userName;
		this.email = email;
		this.busName = busName;
		this.noOfSeat = noOfSeat;
		this.price = price;
		this.total = total;
		this.date = date;
	}



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Transaction [userName=" + userName + ", email=" + email + ", busName=" + busName + ", noOfSeat="
				+ noOfSeat + ", price=" + price + ", total=" + total + ", date=" + date + ", BusId()=" + getId() + "]";
	}
	
	
	
	
	
	
}
