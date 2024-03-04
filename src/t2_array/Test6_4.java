package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test6_4 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("now : " +now);
		
		Scanner sc = new Scanner(System.in);
		String yn = "";
		
		System.out.print("계속 할까요?(Y/N) ");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i =0; i<yn.length(); i++) {
			if(yn.charAt(i) == 'Y'|| yn.charAt(i) == 'y') System.out.println("Y있음");
			//char는 정수형 
			else System.out.println("Y없음");
		}
		sc.close();
		
	}

}
