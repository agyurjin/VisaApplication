package visa;

import java.util.Calendar;

public class Applicant {

	private String name;
	private String passportNumber;
	private String martialStatus;
	private int numberOfFamilyNumbers;
	
	public Applicant(String name, String passportNumber, String martialStatus, int numberOfFamilyNumbers) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.martialStatus = martialStatus;
		this.numberOfFamilyNumbers = numberOfFamilyNumbers;
	}
		

}