package visaCenter;

import java.util.ArrayList;
import java.util.List;

import visa.Bussiness;
import visa.Tourist;

public class VisaCenter implements VisaProcessor {

	@Override
	public boolean applyToVisa(Tourist tourist) {
		int size  = tourist.getLivingPlace().size() - 1;
		if(tourist.getLivingPlace().get(0).getCity() == tourist.getLivingPlace().get(size).getCity())
			return true;
		
		return false;
	}

	@Override
	public boolean applyToVisa(Bussiness bussiness) {
		if(bussiness.getInvitationLetter() == null)
			return false;
		
		return true;
	}

		
}
