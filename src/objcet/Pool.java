package objcet;

public class Pool {
	static public int water=0;
	public void outlet() {
		if(water>=2) {
			water=water-2;
		}else {
			water=0;
		}
	}
	public void inlet() {
		water+=3;
	}
	public Pool() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Pool out=new Pool();
		Pool in=new Pool();
		System.out.println("ˮ���е�ˮ��"+Pool.water);
		System.out.println("��ˮ��עˮ����");
		in.inlet();
		in.inlet();
		System.out.println("ˮ���е�ˮ��"+Pool.water);
		System.out.println("ˮ�ط�ˮһ��");
		out.outlet();
		System.out.println("ˮ���е�ˮ��"+Pool.water);
	}

}
