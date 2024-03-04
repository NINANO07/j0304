package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); //heap 에서 새로운 객체 생성, 
		 		
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
