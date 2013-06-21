package infsys.lessons.java;

import infsys.lessons.java.utils.*;

public abstract class Lesson implements ILesson {
	
	
	private IConsole console;
	
	public Lesson(IConsole aConsole){
		this.console = aConsole;
	}
	
	protected IConsole getConsole(){
		return console;
	}
	

}
