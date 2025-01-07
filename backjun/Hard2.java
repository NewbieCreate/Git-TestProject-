package backjun;

import java.util.Scanner;

public class Hard2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); int m = sc.nextInt(); int f = sc.nextInt(); int sum = 0;
		if (h>=0 && h<=23 || m>=0&& m>=59 || f>=0 && f<=1000) {
			h += f /60;
			m+= f %60;
			if(m>=60) {
				h += 1;
				m -=60;
			}
			if(h >= 24) {
				h -= 24;
			}
			System.out.printf(h+" "+m);
		}
	}
}