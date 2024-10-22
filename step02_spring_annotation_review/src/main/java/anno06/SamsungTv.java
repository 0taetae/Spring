package anno06;

public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		System.out.println("Samsung 켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung 끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsung 소리 키우기");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsung 낮추기");
	}

}
