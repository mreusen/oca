package nl.reusenit.oca.c01declarationsandaccescontrol;

public abstract class Car {
	private double price;
	private String model;
	private String year;

	public abstract void goFast();

	public abstract void goUpHill();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
}
