package book.exam.constructor;

public class SamsungTV implements TV {
	//���� Ŭ���� ���ο��� ����ϴ� ��ü - ������ �����̳ʸ� ���� ���޹��� �� �ֵ��� �غ�
	
	Speaker speaker;	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void On() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}

	public void Off() {
		System.out.println("SamsungTV---���� ����.");
	}

	public void Up() {
		
		System.out.println("SamsungTV---�Ҹ� �ø���.");
		speaker.Up();
		
	}

	public void Down() {
		System.out.println("SamsungTV---�Ҹ� ������.");
		speaker.Down();
	}
}