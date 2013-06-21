package infsys.lessons.java.tests;


import infsys.lessons.java.*;
import org.mockito.*;
import org.junit.Test;

public class PrintOneToFiveTest  extends ConsoleTest{

	@Test
	public void executeTest() {
		new PrintOneToFive(mockConsole).execute();
		
		Mockito.verify(mockConsole).println(1);
		Mockito.verify(mockConsole).println(2);
		Mockito.verify(mockConsole).println(3);
		Mockito.verify(mockConsole).println(4);
		Mockito.verify(mockConsole).println(5);
	}

}
