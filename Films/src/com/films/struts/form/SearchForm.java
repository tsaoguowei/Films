/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.films.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-06-2012
 * 
 * XDoclet definition:
 * @struts.form name="searchForm"
 */
public class SearchForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String keyWord;
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
}