import java.util.*;

class lengthword{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String str="hello Worlda";
		String str1=" And hi ";
		int i;
		String[] word = str.split(" ");
		for(i=0; i < word.length ;i++){
			if(word[i].length() %2 ==0){
				System.out.print(word[i]+" ");
			}
		}
	}
}