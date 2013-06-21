package infsys.lessons.java.tests;


import infsys.lessons.java.utils.*;
import org.mockito.*;
import org.junit.*;

public class ConsoleTest {
	
	@Mock
	protected IConsole mockConsole;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks( this );
	}

}
