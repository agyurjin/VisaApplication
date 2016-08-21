package visaCenter;

import visa.Applicant;
import visa.LivingPlace;
import visa.Tourist;

import java.util.ArrayList;
import java.util.List;

public class VisaDriver{

	public static void main(String[] args){
		
		Applicant applicant1 = new Applicant("Applicant1","AA0000000","single",0);
		List<LivingPlace> livingPlace = new ArrayList<LivingPlace>();

		LivingPlace lv1 = new LivingPlace("Vienna", "Hotel1");
		LivingPlace lv2 = new LivingPlace("Paris", "Hotel2");
		LivingPlace lv3 = new LivingPlace("Rome", "Hotel3");
		LivingPlace lv4 = new LivingPlace("Vienna", "Hotel4");
		
		livingPlace.add(lv1);
		livingPlace.add(lv2);
		livingPlace.add(lv3);
		livingPlace.add(lv4);
		
		Tourist tourist1 = new Tourist(applicant1, 25, livingPlace);

		VisaProcessor vp = new VisaCenter();
		if(vp.applyToVisa(tourist1)){
			System.out.println("Enjoy!!!");
		}
	}
}
