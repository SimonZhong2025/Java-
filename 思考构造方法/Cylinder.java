package package2;

import static java.lang.System.out;

interface Circle1 {
	public static final double radius = 5.0;

	public double area();
}

interface Circle2 extends Circle1 {
	public double height = 10.0;

	public double volume();

	public double faceArea();
}

class Circle {
	// ��static void �Ͳ���static�����𣬵���static����ɿռ��˷ѣ�
	public static void Show() {
		out.print("��ӭ��");
	}
}

public class Cylinder extends Circle implements Circle2 {
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double faceArea() {
		// ֱ����area()����Ϊ������returnֵ�����Բ���area()?
		return Math.PI * 2 * radius * height + area() * 2;
	}

	public double volume() {
		return height * Math.PI * Math.pow(radius, 5);
	}

	public static void main(String[] args) {
		Cylinder aCylinder = new Cylinder();
		out.printf("���������%1.5f\n", aCylinder.area());
		out.printf("�������%1.5f\n", aCylinder.faceArea());
		out.printf("�����%1.5f\n", aCylinder.volume());
		Show();
	}
}
