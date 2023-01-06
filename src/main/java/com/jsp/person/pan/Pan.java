package com.jsp.person.pan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pan_id;
	private long pan_no;
	public int getPan_id() {
		return pan_id;
	}
	public void setPan_id(int pan_id) {
		this.pan_id = pan_id;
	}
	public long getPan_no() {
		return pan_no;
	}
	public void setPan_no(long pan_no) {
		this.pan_no = pan_no;
	}
	

}
