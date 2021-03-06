package di.setter01;

//player가 갖고 있는 dice를 외부에서 (스프링컨테이너) Injection 받아 사용해야 하므로
//Injection 받을 수 있도록 미리 준비해야 한다.
//==> Constructor or Setter메소드
public class Player implements AbstractPlayer {
	 AbstractDice d;
	 int totalValue=0;

	 public Player() {
		 System.out.println("기본생성자");
	 }

	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	public AbstractDice getD() {
		return d;
	}
	
	public void setD(AbstractDice d) {
		this.d = d;
	}

	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}		

	public int getTotalValue(){
		return totalValue;
	}
}