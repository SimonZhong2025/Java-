package javaTest1;

import static java.lang.System.out;

class Family { // ������
	static private String surname = "��"; // �ྲ̬����
	private String givename; // ˽�б���

	static String getSurname() { // �ྲ̬����
		return surname;
	}

	static void changeSurname(String surname) { // �ྲ̬����,��Ϊ�����ྲ̬�����Ѿ���������������Ҫ���������ܸı���
		Family.surname = surname; // ֻ��ʹ�ô��������޶���
	}

	Family(String givename) { // �������Ĺ��췽��,����ʹ��default���ᱣ����װ
		this.givename = givename; // �������������ʹ�ùؼ���this
	}

	Family() { // ���������Ĺ��췽��
		this.givename = "С��";
	}

	public String name() {
		return (surname + givename); // ʹ�ü��������������������surname��givename��������ʮ���е���
	}
}

public class StopForm {
	public static void main(String[] args) {
		// 1��2��ͬ���Ľ������ͬ��ʵ���﷨����
		out.println("1" + Family.getSurname());// �෽������getSurname����
		Family a = new Family(); // ��������������
		out.println("2" + a.getSurname()); // ��������
		out.println("3" + a.name()); // ��������name����
		Family b = new Family("С��"); // ���õ�ʮ����
		Family.changeSurname("��");
		out.println("4" + b.getSurname());
		out.println("5" + b.name());
	}
}
