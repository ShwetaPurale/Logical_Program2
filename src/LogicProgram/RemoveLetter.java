package LogicProgram;
// remove single letter from string
import java.util.Scanner;

public class RemoveLetter {
	
	static String removeWord(String str, String word)
	{
		if(str.contains(word))
		{
			String tempWord=word+" ";
			str=str.replaceAll(word, "");
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		System.out.println("enter a word");
		String word=sc.next();
		
		String str1=removeWord(str, word);
		System.out.println(str1);
		
		 
	}

}
