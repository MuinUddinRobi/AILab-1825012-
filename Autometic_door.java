package Automatic_Door;
import java.util.Random;

public class Autometic_door {

		public static void main(String[] args) {
			String [] state= {"Any one infront of the door ","No one infront of the door","When fire alarm ringing"};
			String[] action= {"open","close"};
			
			Random random=new Random();
			for(int i=0;i<10;i++) {
				String randomState=state[random.nextInt(state.length)];
				switch(randomState) {
				case "Any one infront of the door":
					System.out.println("State: "+state[0]+" =>Action: "+action[0]);
					break;
					
				case "No one infront of the door":
					System.out.println("State: "+state[1]+" =>Action: "+action[1]);
					break;
					
					
				case "When fire alarm ringing":
					System.out.println("State: "+state[2]+" =>Action: "+action[0]);
					break;
				
					
					default:
						System.out.println(" Failed");
	
	
	

}
			}
		}
}









