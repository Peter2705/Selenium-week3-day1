package week3.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String Str = "We learn Java basics as part of java sessions in java week1";
		int count=0;
		String S1="";
		String[] word = Str.split(" ");
		for(int i=0; i<word.length-1;i++) {
			for(int j=i+1;j<word.length;j++) {
				if (word[i].equalsIgnoreCase(word[j])) {
					count=count+1;
					S1=Str.replaceAll(word[j],"");
				}
								
			}
		}
		
		
		if(count>0) {
			System.out.println(S1);
		}
		
	}

}
