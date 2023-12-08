package week3.assignment;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Perform Tasks2");
	}
	
	public static void main(String[] args) {
		LoginPage LP = new LoginPage();
		LP.performCommonTasks();
		LP.clickElement();
		LP.findElement();
		LP.enterText();
	}

}
