
public class chapter06 {
	public static void main(String[] args) {
		int val;
		val = 2 + 5;  // int val = 2 + 5;
		System.out.println(val);

		val++;
		System.out.println(val);

		val *= 5;
		System.out.println(val);

		boolean bool;
		bool = val == 50;
		System.out.println(bool);
		bool = (val < 50) && (val % 10 == 0);  // 比較するときは（）
		System.out.println(bool);
	}
}
