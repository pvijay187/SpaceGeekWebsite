package com.techelevator.ssg.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.planet.Planet;
import com.techelevator.ssg.model.transportation.Transportation;

@Controller
public class HomeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String displayHomePage() {
		return "homePage";
	}

	@RequestMapping(path = "/alienAgeCalc", method = RequestMethod.GET)
	public String displayAlienAgeCalcPage() {

		return "alienAgeCalc";
	}

	@RequestMapping(path = "/alienAgeCalcOutput", method = RequestMethod.GET)
	public String displayAlienAgeCalcOutputPage(@RequestParam String choosePlanet, @RequestParam Double userEarthAge,
			ModelMap modelHolder) {
		Planet planetChoice = getPlanets().get(choosePlanet);
		String ageOnPlanet = planetChoice.calculateAgeOnPlanet(userEarthAge);
		modelHolder.put("planetKey", planetChoice);
		modelHolder.put("ageOutput", ageOnPlanet);

		return "alienAgeCalcOutput";
	}

	@RequestMapping(path = "/alienWeightCalc", method = RequestMethod.GET)
	public String displayAlienWeightCalcPage() {
		return "alienWeightCalc";
	}

	@RequestMapping(path = "/alienWeightCalcOutput", method = RequestMethod.GET)
	public String displayAlienWeightCalcOutputPage(@RequestParam String choosePlanet,
			@RequestParam Double userEarthWeight, ModelMap modelHolder) {
		Planet planetChoice = getPlanets().get(choosePlanet);
		String weightOnPlanet = planetChoice.calculatePlanetWeight(userEarthWeight);
		modelHolder.put("planetKey", planetChoice);
		modelHolder.put("weightOutput", weightOnPlanet);
		return "alienWeightCalcOutput";
	}

	@RequestMapping(path = "/driveTimeCalc", method = RequestMethod.GET)
	public String displayDriveTimeCalcPage() {
		return "driveTimeCalc";
	}

	@RequestMapping(path="/driveTimeCalcOutput", method=RequestMethod.GET)
	public String displayDriveTimeCalcOutputPage(@RequestParam String choosePlanet, @RequestParam String chooseTransportation, @RequestParam String userEarthAge, ModelMap modelHolder) {
		Planet planetChoice = getPlanets().get(choosePlanet);
		Transportation transportationChoice = getTransportation().get(chooseTransportation);
		String travelTime = transportationChoice.yearsToDestination(planetChoice.getDistanceFromEarth());
		Long ageAtArrival = transportationChoice.ageAtArrival(userEarthAge, travelTime);
		
		modelHolder.put("transportKey", transportationChoice);
		modelHolder.put("planetKey", planetChoice);
		modelHolder.put("travelKey", travelTime);
		modelHolder.put("ageKey", ageAtArrival);		
		
		return "driveTimeCalcOutput";
	}
	
	
	

	private Map<String, Planet> getPlanets() {
		Map<String, Planet> planets = new HashMap<String, Planet>();
		planets.put("Mercury", new Planet("Mercury", "mercury.jpg", 0.37, 4.150, 56974146L));
		planets.put("Venus", new Planet("Venus", "venus.jpg", 0.90, 1.620, 25724767L));
		planets.put("Mars", new Planet("Mars", "mars.jpg", 0.38, 0.532, 48678219L));
		planets.put("Jupiter", new Planet("Jupiter", "jupiter.jpg", 2.65, 0.084, 390674710L));
		planets.put("Saturn", new Planet("Saturn", "saturn.jpg", 1.13, 0.033, 792248270L));
		planets.put("Uranus", new Planet("Uranus", "uranus.jpg", 1.09, 0.011, 1692662530L));
		planets.put("Neptune", new Planet("Neptune", "neptune.jpg", 1.43, 0.006, 2703959960L));

		return planets;
	}

	private Map<String, Transportation> getTransportation() {
		Map<String, Transportation> vehicles = new HashMap<String, Transportation>();
		vehicles.put("Walking", new Transportation("Walking", 3));
		vehicles.put("Car", new Transportation("Car", 100));
		vehicles.put("Bullet Train", new Transportation("Bullet Train", 200));
		vehicles.put("Boeing 747", new Transportation("Boeing 747", 570));
		vehicles.put("Concorde", new Transportation("Concorde", 1350));

		return vehicles;
	}
}
