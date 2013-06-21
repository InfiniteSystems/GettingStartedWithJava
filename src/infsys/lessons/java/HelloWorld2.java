package infsys.lessons.java;

import infsys.lessons.java.utils.*;

public class HelloWorld2 extends Lesson {
	
	
	public HelloWorld2(IConsole aConsole) {
		super(aConsole);
	}

	@Override
	public void execute() {
		getConsole().println("Hello World"); 
	}

}
