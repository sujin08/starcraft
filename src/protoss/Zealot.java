package protoss;

//object(��ü)�� ���¿� �ൿ�� ������
public class Zealot {
	public Zealot(){
		this(100,100,16,1);
	}
	public Zealot(int st, int sh,int attack,int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("My Life Aior");
	}
	final String name ="����";
	int st;
	int sh;
	int attack;
	int armor;


}
