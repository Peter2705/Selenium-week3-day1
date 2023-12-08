package week3.assignment;

public class Elements extends Button{

	public static void main(String[] args) {
		System.out.println("Button class Verification");
		System.out.println("-----------------");
		Button b = new Button();
		b.click();
		b.setText("Welcome Button class");
		b.submit();
		System.out.println();
		System.out.println("TextFields Class Verification");
		System.out.println("-----------------");
		TextField TF = new TextField();
		TF.click();
		TF.setText("Welcome Text field class");
		TF.getText();
		System.out.println();
		System.out.println("Checkbox class verification");
		System.out.println("-----------------");
		CheckBoxButton CB = new CheckBoxButton();
		CB.click();
		CB.setText("Welcome to Checkbox class");
		CB.submit();
		CB.clickCheckButton();
		System.out.println();
		System.out.println("RadiBox Class verification");
		System.out.println("-----------------");
		RadioButton RB = new RadioButton();
		RB.click();
		RB.setText("Welcome to RadioButton class");
		RB.submit();
		RB.selectRadioButton();
		System.out.println();
		System.out.println("Execution class verification");
		System.out.println("-----------------");
		Elements E = new Elements();
		E.click();
		E.setText("Welcome to the Execution Class");
		E.submit();
	}

}
