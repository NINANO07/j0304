package t2_array;

public class Test1 {
	public static void main(String[] args) {
		int atom = 0;
		
		int mbc1 = 0;
		int mbc2 = 0;
		int mbc3 = 0;
		int mbc4 = 0;
		int mbc5 = 0;
		
		System.out.println("mbc1 = " +mbc1);
		System.out.println("mbc2 = " +mbc2);
		System.out.println("mbc3 = " +mbc3);
		System.out.println("mbc4 = " +mbc4);
		System.out.println("mbc5 = " +mbc5);
		System.out.println();	
		
	  mbc1 = 5;
		mbc2 = 5;
		mbc3 = 5;
		mbc4 = 5;
		mbc5 = 5;
		
		System.out.println("mbc1 = " +mbc1);
		System.out.println("mbc2 = " +mbc2);
		System.out.println("mbc3 = " +mbc3);
		System.out.println("mbc4 = " +mbc4);
		System.out.println("mbc5 = " +mbc5);
		System.out.println();		
		
		mbc1 = 10;
		mbc2 = 20;
		mbc3 = 30;
		mbc4 = 40;
		mbc5 = 50;
		
		System.out.println("mbc1 = " +mbc1);
		System.out.println("mbc2 = " +mbc2);
		System.out.println("mbc3 = " +mbc3);
		System.out.println("mbc4 = " +mbc4);
		System.out.println("mbc5 = " +mbc5);
		System.out.println();	
		
		int kbc1 =100;
		int kbc2 =30;
		int kbc3 =80;
		int kbc4 =50;
		int kbc5 =90;
		
		System.out.println("kbc1 = " +kbc1);
		System.out.println("kbc2 = " +kbc2);
		System.out.println("kbc3 = " +kbc3);
		System.out.println("kbc4 = " +kbc4);
		System.out.println("kbc5 = " +kbc5);
		System.out.println();
		

		
//		int[] mbc; or int = mbc[];
//		mbc = new int[5];
// 기본 타입 초기화 안하면 뭐가 들어가 있는지 모름	

		int[] mbc = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i+1)+"] = " +mbc[i]);
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			mbc[i] = 5;
		}
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i+1)+"] = " +mbc[i]);
		}
		System.out.println();
		
		for(int i=0; i<5; i++) {
			mbc[i] = (i+1) * 10 ;
		}
		for(int i=0; i<5; i++) {
			System.out.println("mbc["+(i+1)+"] = " +mbc[i]);
		}
		System.out.println();
		
		int[] sbs = new int[5];
		sbs[0]=100;
		sbs[1]=30;
		sbs[2]=80;
		sbs[3]=50;
		sbs[4]=90;
		
		for(int i=0; i<5; i++) {
			System.out.println("sbs["+(i+1)+"] = " +sbs[i]);
		}
		System.out.println();
		
		int[] sbs2 = new int[] {100, 30, 80, 50, 90};

		
		for(int i=0; i<5; i++) {
			System.out.println("sbs["+(i+1)+"] = " +sbs2[i]);
		}
		System.out.println();
		
		int[] sbs3 = {100, 30, 80, 50, 90};

		
		for(int i=0; i<5; i++) {
			System.out.println("sbs["+(i+1)+"] = " +sbs3[i]);
		}
		System.out.println();
	}

}