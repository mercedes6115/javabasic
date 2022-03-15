package day09;

public class LedTvTest {
public static void main(String[] args) {
	Tv tv = new LedTv();
	tv.turnOn();
	tv.changeChannel(10);
	tv.changeVolume(60);
	tv.turnOff();
	}
}
