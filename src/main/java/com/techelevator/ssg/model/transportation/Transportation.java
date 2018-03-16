package com.techelevator.ssg.model.transportation;

public class Transportation {
	private String transportName;
	private Integer speed;

	public Transportation(String transportName, Integer speed) {
		this.transportName = transportName;
		this.speed = speed;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	// Methods
	public String yearsToDestination(Long distanceFromEarth) {
		Long travelTime = (distanceFromEarth / this.speed) / 8760;
		return travelTime.toString();
	}

	public Long ageAtArrival(String userEarthAge, String travelTime) {

		Long ageAtArrival = Long.parseLong(userEarthAge) + Long.parseLong(travelTime);
		return ageAtArrival;
	}

}
