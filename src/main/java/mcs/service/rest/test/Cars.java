package mcs.service.rest.test;



public class Cars {
	/*Field Variables*/
	private String make;
	private String model;
	private int year;
	
	/*Default Constructor*/
	public Cars()
	{
		make = "";
		model = "";
		year = 0;
	}
	
	/*Overloaded Constructor*/
	public Cars(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}

	/*Getters and Setters*/
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/*toString*/
	@Override
	public String toString() {
		return "make:" + make + "\nmodel:" + model + "\nyear:" + year;
	}
	
	
}
