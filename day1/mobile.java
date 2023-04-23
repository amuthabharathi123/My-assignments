package week1.day1;

public class mobile {

	public void sendSms() {
		
 System.out.println("sendSms");
	}
	
  protected void allowVoiceCall() {
	
	  System.out.println("allowVoiceCall");
	 
  }
  
  private void takeVideo() {
	  System.out.println("takeVideo");
  }
 
  public static void main(String[] args) {
	mobile mob=new mobile();
	mob.sendSms();
	mob.allowVoiceCall();
	mob.takeVideo();
	
}
   
}
  
  