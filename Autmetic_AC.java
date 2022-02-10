package Automatic_Door;
import java.util.Random;

public class Autmetic_AC {

		public static void main(String[] args) {
			String [] state= {"Normal Temperature up to 40 degree","Normal Temperature down to 20 degree"};
			String[] action= {"AC ON","AC OFF"};
			
			Random random=new Random();
			for(int i=0;i<10;i++) {
				String randomState=state[random.nextInt(state.length)];
				switch(randomState) {
				case "Normal Temperature up to 40 degree":
					System.out.println("State: "+state[0]+" =>Action: "+action[0]);
					break;
				case "Normal Temperature down to 20 degree":
					System.out.println("State: "+state[1]+" =>Action: "+action[1]);
					break;
				
					
					default:
						System.out.println(" Failed");
	
	
	

}
			}
		}
}
