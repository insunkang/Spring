package di.constructor02;

public class ServiceImpl implements Service {
	logic myLogic;
	String name;
	String msg;
	
	public ServiceImpl(logic myLogic, String name, String msg) {
		super();
		this.myLogic = myLogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImple�� �Ű����� 3�� ������");
	}

	@Override
	public void test() {
		
		System.out.println(msg+","+name);
		myLogic.testlogic();

	}

}