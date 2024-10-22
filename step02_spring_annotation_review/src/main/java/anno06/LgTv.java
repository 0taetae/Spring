package anno06;

public class LgTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("LgTv 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv 끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv 소리 키우기");
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv 소리 낮추기 ");
	}

}
