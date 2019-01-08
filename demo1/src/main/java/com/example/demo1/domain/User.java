package com.example.demo1.domain;

import java.util.Date;

public class User {
//	name,number,dgh,max_gh,weight
	private int id;
	
	private String name; //单板名称
	
	private int number;//数量
	
	private int dgh;  //典型功耗
	
	private int max_gh; //最大功耗
	
	private int weight; //重量

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getDgh() {
		return dgh;
	}

	public void setDgh(int dgh) {
		this.dgh = dgh;
	}

	public int getMax_gh() {
		return max_gh;
	}

	public void setMax_gh(int max_gh) {
		this.max_gh = max_gh;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}



	
	
	
}
