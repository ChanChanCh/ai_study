package day14;
/*
 * ���ڿ� ����� ����� �ΰ����� . new ��� & new �̻��
 *
 * new ��� : ���ڿ��� ����� �����ϰ� ���ο� ��ü�� �����Ѵ�.
 * new �̻�� : ���� ���ڿ��� ���ؼ��� ���� ����� �����Ѵ�.
 * 
 * � �� ������ Ư¡
 * 1. �⺻ �ڷ��� ���� �񱳴� ũ�� ���̴�.
 * 2. ���� �ڷ��� ���� �񱳴� �޸𸮰� ���� ��������� ���� ���̴�.
 * 
 */
public class CompareString {

	public static void main(String[] args) {
		String word1 = new String("�޸� ���Ȯ��");
		String word2 = new String("�޸� ���Ȯ��");
		String word3 = "�޸� ���Ȯ��";
		String word4 = "�޸� ���Ȯ��";

		System.out.println(word1 == word2);
		System.out.println(word3 == word4);

	}

}
