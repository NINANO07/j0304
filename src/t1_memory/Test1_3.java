package t1_memory;

import java.util.Scanner;

public class Test1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ans = "N"; //1 계속, 0 그만
		int cnt = 0;
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속할까요?(Y:계속, N:중단) ");
			ans = sc.next();
			if(ans.equals("N")) break;
		}
		System.out.println("작업끝");
	 
		sc.close();
	}

}
