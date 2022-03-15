package day09;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j); //{} : Abstract methods do not specify a body default없으면 에러 발생
	
	default int exec(int i, int j) {
		return i+j;
	}
	
	public static int exec2(int i, int j) {
		return i*j;
	}

}
