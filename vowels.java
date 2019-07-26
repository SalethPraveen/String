package string;

import java.util.Scanner;

public class vowels {
	String n;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Words");
		n = scan.nextLine();
		scan.close();
	}

	public void check() {
		int vcount = 0;
		int scount = 0;
		int dcount = 0;
		int ccount = 0;
		
		for (int i = 0; i < n.length(); i++) {
			// System.out.println(n.charAt(i));
			if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o'
					|| n.charAt(i) == 'u') {
				vcount++;
				// System.out.println(n.charAt(i)+",");
			} else if (n.charAt(i) == ' ') {
				scount++;
				// System.out.println(n.charAt(i)+",");
			} else if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
				dcount++;
				// System.out.println(n.charAt(i)+",");
			} else {
				ccount++;
			}
		}
		System.out.println("Vowels counts are" + vcount);
		System.out.println("Space counts are" + scount);
		System.out.println("Digit counts are" + dcount);
		System.out.println("Constent Count are" + ccount);
	}

}
