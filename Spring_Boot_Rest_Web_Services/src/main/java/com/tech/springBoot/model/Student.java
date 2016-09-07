package com.tech.springBoot.model;

import java.math.BigInteger;

public class Student {
	private BigInteger id;
	private String name;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
