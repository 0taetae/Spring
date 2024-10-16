package anno06;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("LG TV - 전원 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("LG TV - 전원 끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV - 소리 높이기 ");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV - 소리 줄이기 ");
	}

}
