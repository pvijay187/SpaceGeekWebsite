package com.techelevator.ssg.model.planet;

public class Planet {
	// Initialize
	private String planetName;
	private String imgName;
	private Double gravRatio;
	private Double equivEarthYears;
	private Long distanceFromEarth;

	// Constructor
	public Planet(String planetName, String imgName, Double gravRatio, Double equivEarthYears, Long distanceFromEarth) {
		this.planetName = planetName;
		this.imgName = imgName;
		this.gravRatio = gravRatio;
		this.equivEarthYears = equivEarthYears;
		this.distanceFromEarth = distanceFromEarth;
	}

	// Methods
	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String name) {
		this.planetName = name;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Double getGravRatio() {
		return gravRatio;
	}

	public void setGravRatio(Double gravRatio) {
		this.gravRatio = gravRatio;
	}

	public Long getDistanceFromEarth() {
		return distanceFromEarth;
	}

	public void setDistanceFromEarth(Long distanceFromEarth) {
		this.distanceFromEarth = distanceFromEarth;
	}

	// Method
	public String calculatePlanetWeight(Double userInput) {
		Long weightOnPlanet = Math.round(userInput * this.gravRatio);

		return weightOnPlanet.toString();
	}

	public String calculateAgeOnPlanet(Double userInput) {
		Long ageOnPlanet = Math.round(userInput * this.equivEarthYears);
		return ageOnPlanet.toString();
	}

	public Double getEquivEarthYears() {
		return equivEarthYears;
	}

	public void setEquivEarthYears(Double equivEarthYears) {
		this.equivEarthYears = equivEarthYears;
	}

}
