package package2;

class Shape {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// public Shape(){}�ǲ���Ҫ�ģ�ֻ��Ҫ����x��y��������Ҫ���õ�����

	public int getx() {//��Ϊ�ǵ��ã�����Ҫ���ã�������Ҫ����int���ͣ�����Ҫreturn����͹��췽����ͬ
		return x;
	}

	public int gety() {
		return y;
	}
}

public class InheritShape extends Shape {
	void test() {
		set(10, 20);
		System.out.printf("x=%d y=%d", getx(), gety());
	}

	public static void main(String[] args) {
		InheritShape a = new InheritShape();
		a.test();
	}
}
//��һ��ͬ��