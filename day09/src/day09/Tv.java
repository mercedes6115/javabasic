package day09;
// 인터페이스: 구현은 없고 긴으만 선언
public interface Tv {
	
	public int MIN_VLOUME = 0;
	public int MAX_VLOUME = 100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	
	
}
