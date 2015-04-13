package command;

public class Invoker {
	Command command;
	
	public Invoker(Command c) {
		command = c;
	}

	public void setCommand(Command c) {
		command = c;
	}
	
	public void invoke() {
		command.execute();
	}
}
