package practice;
import java.util.Scanner;

public class Lab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字を入力してください");
		int i = scanner.nextInt();
		scanner.close();
		if(i % 15 == 0) {
			System.out.println("FizzBuzz");
		} else if(i % 5 == 0) {
			System.out.println("Fizz");
		} else if(i % 3 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("有効ではありません");
		}
	}
}
