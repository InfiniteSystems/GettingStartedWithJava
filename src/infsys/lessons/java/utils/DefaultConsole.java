package infsys.lessons.java.utils;

public class DefaultConsole implements IConsole {

	@Override
	public void println(String aString) {
		System.out.println(aString);
	}
	
	@Override
	public void println(int anInteger) {
		System.out.println(anInteger);
	}

}
