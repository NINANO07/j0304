package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_3 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now : " +now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속 할까요?(Y/N) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i =0; i<yn.length(); i++) {
			if(yn.equals("y")) System.out.println("Y입니다");
			else System.out.println("Y아닙니다");
		}
		sc.close();
		
	}

}
