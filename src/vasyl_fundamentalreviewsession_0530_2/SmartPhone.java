package vasyl_fundamentalreviewsession_0530_2;



public class SmartPhone extends MP3Phone {

	public boolean isTouchScreen;
	
	public SmartPhone(String phoneNUmber, int memorySize, boolean isTouchScreen) {
		super(phoneNUmber, memorySize, true);
		this.isTouchScreen=isTouchScreen;
	}
	

}