package visaCenter;

import visa.Bussiness;
import visa.Tourist;

public interface VisaProcessor {

	boolean applyToVisa(Tourist tourist);
	boolean applyToVisa(Bussiness bussiness);
//	boolean applyToVisa(Imigrant imigrant);
	
}
