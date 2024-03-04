package t1_memory;

public class Test3 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
		
	//검색해서 같은게 있으면 생성안하기 때문 thread 에 변수만 생성 주소 같음
		
		if(name1 == name2) System.out.println("name1와 name2는 같습니다");
		else System.out.println("name1와 name2는 다릅니다");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 홍길동");
		else System.out.println("name1은 홍길동 아님");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 2는 같다");
		else System.out.println("name1과 2는 같지 않다");
		System.out.println();
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		
	}

}
