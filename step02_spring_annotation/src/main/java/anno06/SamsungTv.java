package anno06;

public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("Samsung TV - 전원 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV - 전원 끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsung TV - 소리 높이기 ");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsung TV - 소리 줄이기 ");
	}

}
