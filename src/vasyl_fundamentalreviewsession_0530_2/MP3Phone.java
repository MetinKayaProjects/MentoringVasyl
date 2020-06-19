package vasyl_fundamentalreviewsession_0530_2;

public class MP3Phone extends Phone{
	private int memorySize;
	private boolean playsAAC;
	
	public MP3Phone(String phoneNumber, int memorySize, boolean playsAAC) {
		super(phoneNumber, true); //phoneNumber is assigned in super class. so we call super() class
		this.memorySize = memorySize;
		this.playsAAC = playsAAC;
	}
	

}
