package infsys.lessons.java;

import infsys.lessons.java.utils.IConsole;

public class PrintOneToFive extends Lesson {

	public PrintOneToFive(IConsole aConsole) {
		super(aConsole);
	}

	@Override
	public void execute() {
		
		for (int count = 1; count <=5; count++){
			getConsole().println(count);
		}

	}

}
