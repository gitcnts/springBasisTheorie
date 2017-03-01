package be.vdab;

import java.util.Map;

// import java.util.Set;

//import java.util.Arrays;

class HelpdeskMedewerkers {

	private final Map<String, Integer> medewerkers;

	HelpdeskMedewerkers(Map<String, Integer> medewerkers) {
		this.medewerkers = medewerkers; // key = naam medewerker, value=intern
										// telefoonnummer
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}

	// private Set<String> namen;
	//
	// public void setNamen(Set<String> namen) {
	// this.namen = namen;
	// }
	//
	// @Override
	// public String toString() {
	// return namen.toString();
	// }

	// private String[] namen; // je maakt zelf een setter
	//
	// public void setNamen(String[] namen) {
	// this.namen = namen;
	// }
	//
	// @Override
	// public String toString() {
	// return Arrays.toString(namen);
	// }

}
