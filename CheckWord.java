package string;

import java.util.Scanner;

public class CheckWord {
	String s = new String("This fruit is in green color");
	String sen,fin;
	public void check()
	{
		System.out.println(s.contains("green"));
	}
	
	public void disply()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		sen = scan.nextLine();
		System.out.println("enter a find word");
		fin = scan.nextLine();
		
		System.out.println(sen.contains(fin));
	
}
}
