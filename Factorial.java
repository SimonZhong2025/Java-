package package2;

public class Factorial {

	static int factorial(int a) { // �෽������ֱ�ӵ��ã�������ʡ�������η����Լ���һ��int������ֵ����������
		if (a == 1) {
			return a = 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 8; i++) {
			result = factorial(i);

			System.out.printf("%2d!=%1d\n", i, result);
		}
	}
}
