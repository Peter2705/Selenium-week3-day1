package week3.assignment;

public class ChangeOddIndex {
	
	public static void revOdd(String str) {
		char[] rev = str.toCharArray();
		String rev1 = "";
		for(int i=0; i<rev.length;i++) {
			if (i%2!=0) {
			rev[i]=Character.toUpperCase(rev[i]);
			rev1 = rev1+rev[i];
			}
			else {
				rev1=rev1+rev[i];
			}
		}
		System.out.println(rev1);
	}

	public static void main(String[] args) {
		
		revOdd("changeme");
	}

}
