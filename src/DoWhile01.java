
public class DoWhile01 {
	public static void main(String[] args) {
        int number = 1;
        while (number < 50) {
            number *= 2;
            System.out.println("While01 = " + number);
        }
    }
}
//while文との違いは評価のタイミング、do-while 文では、ブロック実行後に評価を行うの初期値がfalseでも、一度はブロックが実行される。
