package Chapter05;

public class Chapter05 {
	public static void main(String[] args) {
//		プリミティブ型のlong double boolean
		long long1 = 1234567L;
		double double1 = 1234.56D;
		boolean boolean1 = true;
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(boolean1);
		
		
		Float float1 = 0.123F;
		System.out.println(float1);
		Integer i = 100;
		System.out.println(i);
		Character c = 'う';
		System.out.println(c);
		
		int[] array1 = new int[] { 10,20,30,40,50 };  //配列の宣言と生成　5つの要素
//		int[] array1 = { 10,20,30,40,50 };  //こっちの書き方でもいい
		System.out.println(array1[2]);  //30出力
		
	}
}

