package t2_array;
//향상된 for 문(객체 안의 내용을 반복처리)
public class Test3 {
	public static void main(String[] args) {
		int[] su = {100, 80, 50, 30, 70, 60};
		
		System.out.println("일반적인 for문 출력");
		for(int i=0; i<5; i++) { //60점 누락
			System.out.print(su[i] + " ");
		}
		
		System.out.println();
		for(int i=0; i<su.length; i++) {
			System.out.print(su[i] + " ");
		}
		System.out.println();
		//향상된 for 문 : for(타입 배열안의값을담을변수:객체명(또는 배열명))
		System.out.println("향상된 for문 출력");
		for(int s : su) {
			System.out.print(s+"/");
		}
		System.out.println("향상된 for문 출력(인덱스와 함께 출력)");
		int sel = 0;
		for(int s : su) {
			System.out.println(sel +" : " +s);
			sel++;
		}
	}

}
