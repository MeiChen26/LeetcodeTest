package ipv6;

import java.util.Scanner;
import java.util.regex.Pattern;
public class Ipv6Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.next();
			if(Pattern.matches("^::/128$|^([0]{4}:){7}[0]{4}$", str)) 
				System.out.println("unspecified");
		}
	}
}
