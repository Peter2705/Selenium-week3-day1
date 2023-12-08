package week3.assignment;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter Username");
	}
	
	public void enterPassword() {
		System.out.println("Enter Password");
	}
	
	public static void main(String[] args) {
		LoginTestData L = new LoginTestData();
		L.enterCredentials();
		L.navigateToHomePage();
		L.enterUsername();
		L.enterPassword();
	}
}
