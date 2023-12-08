package week3.assignment;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("The message is "+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		System.out.println("The second message is :"+endpoint+" "+ requestBody+" "+ requestStatus);
	}
	
	public static void main(String[] args) {

		APIClient AP = new APIClient();
		AP.sendRequest("Welcome");
		AP.sendRequest("Welcome to", "TestLeaf", true);
	}

}
