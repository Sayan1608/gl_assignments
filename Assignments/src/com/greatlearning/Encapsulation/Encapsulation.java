package com.greatlearning.Encapsulation;

public class Encapsulation {

	private String country;
	private String nationalAnthem;
	private String touristSpot;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}

	public String getTouristSpot() {
		return touristSpot;
	}

	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setCountry("India");
		obj.setNationalAnthem("Jana Gana Mana");
		obj.setTouristSpot("Howrah Bridge");

		System.out.println("Country: " + obj.getCountry());
		System.out.println("National Anthem: " + obj.getNationalAnthem());
		System.out.println("Tourist Spot: " + obj.getTouristSpot());
	}

}
