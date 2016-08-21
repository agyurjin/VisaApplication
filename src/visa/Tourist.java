package visa;

import java.util.ArrayList;
import java.util.List;

public class Tourist extends VisaApplication {
	
	private List<LivingPlace> livingPlace = new ArrayList<LivingPlace>();
	
	public Tourist(Applicant applicant, int visaDuration, List<LivingPlace> livingPlace) {
		super(applicant, visaDuration);
		this.livingPlace = livingPlace;
	}

	public List<LivingPlace> getLivingPlace() {
		return livingPlace;
	}

	public void setLivingPlace(List<LivingPlace> livingPlace) {
		this.livingPlace = livingPlace;
	}
}
