package week1.day2;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Call connected");
	}
	
	public void sendMsg() {
		System.out.println("Message Sent");

	}

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		
		mob.makeCall();
		mob.sendMsg();

	}

}
