package di.setter02;

public class ServiceImpl implements Service {
	logic myLogic;//setter injection
	String name; //constructor injection
	String msg;//constructor injection
	
	public ServiceImpl() {
		
		
		System.out.println("ServiceImple의 기본 생성자");
	}
	public ServiceImpl(String name, String msg) {
		super();
		this.name = name;
		this.msg = msg;
		System.out.println("매개변수 2개 생성자");
	}
	public logic getMyLogic() {
		return myLogic;
	}

	public void setMyLogic(logic myLogic) {
		this.myLogic = myLogic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ServiceImpl(logic myLogic, String name, String msg) {
		super();
		this.myLogic = myLogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImple의 매개변수 3개 생성자");
	}

	@Override
	public void test() {
		
		System.out.println(msg+","+name);
		myLogic.testlogic();

	}

}
