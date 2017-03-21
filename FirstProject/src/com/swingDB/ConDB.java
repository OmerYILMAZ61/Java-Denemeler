package com.swingDB;

public enum ConDB {

	HOST(1,"ec2-54-243-185-99.compute-1.amazonaws.com"),
	DBNAME(2,"d2fpqk5s7dkvjc?sslmode=require"),
	PORT(3,"5432"),
	USERNAME(4,"xdneizhsfqqtaz"),
	PASSWORD(5,"c5fbc482c3f4c57dd905a15e970b4b2604af26595d186eeeed7d53b7f0f46b40"),
	DBSTR(6,"jdbc:postgresql://");
	
	int id;
	String value;
	
	
	ConDB(int id, String value){
		this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	
	public String getValue() {
		return value;
	}
	
	static String dbConnection(){
		String value = ConDB.DBSTR.getValue()
		+ConDB.HOST.getValue()
		+":"+
		ConDB.PORT.getValue()
		+ "/"
		+ConDB.DBNAME.getValue();
		return value;
	}
	
	
}
