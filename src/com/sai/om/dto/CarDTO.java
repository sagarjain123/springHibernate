package com.sai.om.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="car_table")
public class CarDTO implements Serializable {
	
	public CarDTO() {
	   System.out.println("cardto is created");
	}
	@Id
	@Column(name="car_id")
	private int Carid;
	@Column(name="car_name")
	private String Carname;
	@Column(name="car_cost")
	private double 	Carcost;
	
	
	public int getCarid() {
		return Carid;
	}
	public void setCarid(int carid) {
		Carid = carid;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public double getCarcost() {
		return Carcost;
	}
	public void setCarcost(double carcost) {
		Carcost = carcost;
	}
	
	

}
