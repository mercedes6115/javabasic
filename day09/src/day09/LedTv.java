package day09;

public class LedTv implements Tv {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 킵니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");

	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨"+volume+"로 조절");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("채널"+channel+"번으로 변경");

	}

}
