package infsys.lessons.java.tests;


import infsys.lessons.java.*;
import org.mockito.*;
import org.junit.*;


public class HelloWord2Test extends ConsoleTest{

	

	@Test
	public void testExecute() {
		
		new HelloWorld2(mockConsole).execute();
		
		Mockito.verify(mockConsole).println(org.mockito.Matchers.eq("Hello World"));
		
	}

}
