package com.junitprogrammingcookbook.model;

import java.util.List;

public class Account {

	private String name;
	private String description;
	private List<String> fones;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getFones() {
		return fones;
	}
	public void setFones(List<String> fones) {
		this.fones = fones;
	}
}
