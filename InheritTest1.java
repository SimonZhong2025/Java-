package package2;

class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	protected Person() {//����̳и����ʱ����Զ��̳и����Ĭ�Ϲ��캯����Ҳ���Ǽ̳��Ǹ��޲����Ĺ��캯����
	}

	public void getInfo() {//get����
		System.out.println(name);
		System.out.println(age);
	}
}

public class InheritTest1 extends Person {
	public void study() {
		System.out.println("Studying!");
	}

	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Person";
		a.age = 30;
		a.getInfo();
		InheritTest1 b = new InheritTest1();
		b.name = "Student";
		b.age = 16;
		b.getInfo();
		b.study();
	}

}
