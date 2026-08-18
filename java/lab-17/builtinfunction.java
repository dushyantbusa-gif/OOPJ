import java.util.*;

class builtinfunction{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String str="hello World        ";
		String str1=" And hi         ";

		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.concat(str1));
		System.out.println(str.indexOf("o"));
		System.out.println(str.equals(str1));
		System.out.println(str.valueOf(1));
		System.out.println(str.trim());
		System.out.println (str.substring(4,8));
		// System.out.println (str.substring(4,8));

	}
}