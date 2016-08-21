package visa;

public class VisaApplication {

	private Applicant applicant;
	private int visaDuration; //Number of days
	
	public VisaApplication(Applicant applicant, int visaDuration) {
		this.applicant = applicant;
		this.visaDuration = visaDuration;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public int getVisaDuration() {
		return visaDuration;
	}

	public void setVisaDuration(int visaDuration) {
		this.visaDuration = visaDuration;
	}	
}
