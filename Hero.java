package package2;

class Heroric {
	String name;

	void name() {
	}
}

public class Hero extends Heroric {
	public void attack() {
		System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
	}

//Ϊʲô������Hero ������String��Ϊʲô������name������bh.name???
//��void����void����
	public void attack(Hero h1) {
		System.out.println(name + "��" + h1.name + "������һ�ι��� ");
	}

	public void attack(Hero h1, Hero h2) {
		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
	}

	public static void main(String[] args) {
		Hero bh = new Hero();
		bh.name = "�ͽ�����";

		Hero h1 = new Hero();
		h1.name = "����";
		Hero h2 = new Hero();
		h2.name = "��Ī";

		bh.attack(h1);
		bh.attack(h1, h2);
	}

}
