package Android;

public class AndroidPhone {

	int phonePrice=21980,screenSize=6;
	double thickness=0.32;
	boolean isAudioJackPresent=true;
	
	
	
    String phoneName="Redmi Note 5 Pro";
	String phoneBrand="Xiaomi";
	
	public void myAwesomeProjects() {
		
		System.out.println("The phone price is "+ phonePrice);
		System.out.println("The screenSize is "+screenSize+"inches");
		System.out.println("The thickness of the phone is "+ thickness+"inches");
		System.out.println("The condition of AudioJack is "+isAudioJackPresent);
		System.out.println("The name of the mobile is "+phoneName);
		System.out.println("The name of the company manufacturing mobile is "+phoneBrand);
		
		
		
		
	}
	
	public void buildPhone(int phonePrice,int screenSize,double thickness,boolean isAudioJackPresent,String phoneName,String phoneBrand) {
		
		this.phonePrice=phonePrice;
	    this.screenSize=screenSize;
	    this.thickness=thickness;
	    this.isAudioJackPresent=isAudioJackPresent;
	    this.phoneName=phoneName;
	    this.phoneBrand=phoneBrand;
	}//thankyou bhaiyaa
	
	
}
