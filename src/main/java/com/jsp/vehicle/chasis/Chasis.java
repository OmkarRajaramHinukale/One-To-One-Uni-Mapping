package com.jsp.vehicle.chasis;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chasis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int chasis_id;
	private String chasis_no;
	public int getChasis_id() {
		return chasis_id;
	}
	public void setChasis_id(int chasis_id) {
		this.chasis_id = chasis_id;
	}
	public String getChasis_no() {
		return chasis_no;
	}
	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}	
	

}