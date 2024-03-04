package t2_array;

import java.util.Arrays;

public class Test6_2 {
	public static void main(String[] args) {
		char[] strArray  = {'k','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println(strArray); //char타입 배열은 String처럼 되어버림
		System.out.println();
		
		System.out.println("strArray의 길이 : " +strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자열로 변환 : " + Arrays.toString(strArray));
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " +strArray[i]);
		}
		System.out.println();
		
		String str = "korea";
		//현재 문자열중에서 특정 인텍스에 위치한 문자를 반환 charAt()
		for(int i=0; 1<str.length(); i++) {
			System.out.println("str("+i+") = " + str.charAt(i));
			
		}
		
		
		
	}

}
