package visa;

public class Bussiness extends VisaApplication{
	private double investments;
	private String invitationLetter;
	
	public Bussiness(Applicant applicant, int visaDuration, double investments, String invitation) {
		super(applicant, visaDuration);
		this.investments = investments;
		this.invitationLetter = invitation;
	}

	public double getInvestments() {
		return investments;
	}

	public void setInvestments(double investments) {
		this.investments = investments;
	}

	public String getInvitationLetter() {
		return invitationLetter;
	}

	public void setInvitationLetter(String invitationLetter) {
		this.invitationLetter = invitationLetter;
	}
	
}
