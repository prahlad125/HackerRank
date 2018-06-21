package Android;

import java.util.Scanner;
public class Driver {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int phonePrice=sc.nextInt();
		int screenSize=sc.nextInt();
		double thickness=sc.nextDouble();
		boolean audioJack=sc.hasNext();
		String phoneName=sc.nextLine();
		String phoneBrand=sc.nextLine();
		
		AndroidPhone ap=new AndroidPhone();
		ap.buildPhone(phonePrice, screenSize, thickness, audioJack, phoneName, phoneBrand);
		ap.myAwesomeProjects();
		sc.close();
	}

}
