package week3.assignment;

public class ReverseOddWords {

	public static void main(String[] args) {
		String str = "I am a software tester";
		String[] word = str.split(" ");
        for (int i=0; i<word.length;i++) {
        	if(i%2!=0) {
        		
        		char arr[]=word[i].toCharArray();
        		for (int j=arr.length-1;j>=0;j--) {
        			System.out.print(arr[j]);
        		}
        		System.out.print(" ");
        	}
        	else {
    			System.out.print(word[i]+" ");
    		}
        }
        
	}

}
