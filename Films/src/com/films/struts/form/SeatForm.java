/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.films.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 11-28-2012
 * 
 * XDoclet definition:
 * @struts.form name="seatForm"
 */
public class SeatForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String rows[];
	private String nums[];
	public String[] getRows() {
		return rows;
	}
	public void setRows(String[] rows) {
		this.rows = rows;
	}
	public String[] getNums() {
		return nums;
	}
	public void setNums(String[] nums) {
		this.nums = nums;
	}
	
}