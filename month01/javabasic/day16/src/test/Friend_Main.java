package test;

class Friend{
	
	protected String name;
	protected String call_num;
	
	Friend(String name, String call_num){
		this.name = name;
		this.call_num = call_num;	
	}
	public void showInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("��ȭ��ȣ: "+call_num);
	}
}

class SchoolFriend extends Friend{
	private String adress;
	SchoolFriend(String name, String call_num, String ad){
		super(name, call_num);
		adress = ad;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�ּ� : " + adress);
		
	}
}

class UnivFriend extends Friend{
	private String job;
	
	UnivFriend(String name, String call_num, String job){
		super(name, call_num);
		this.job = job;
		System.out.println("���� : " + job);
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + job);
		
	}
	
}


public class Friend_Main {

	public static void main(String[] args) {
		
		Friend[] frds = new Friend[10];
		int cnt = 0;
		frds[cnt++] = new SchoolFriend("cy","010-1234-1237","����");
		frds[cnt++] = new SchoolFriend("yon","010-1245-1634","����");
		frds[cnt++] = new SchoolFriend("son","010-1256-4434","�뱸");
		frds[cnt++] = new UnivFriend("sung","010-1776-7734","�ǻ�");
		frds[cnt++] = new UnivFriend("sSon","010-1776-7734","�Ǽ�");
		
		for(int i =0; i<cnt; i++) {
			frds[i].showInfo();
			System.out.println();
		}
		
		
		
		
	}

}
