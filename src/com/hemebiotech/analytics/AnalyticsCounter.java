package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	public static void main(String args[]) {
		//lecture des symptomes
		ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptoms = symptomReader.getSymptoms();
	}
}
