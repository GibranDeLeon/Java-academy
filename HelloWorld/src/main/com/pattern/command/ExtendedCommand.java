package main.com.pattern.command;

import java.time.Duration;

public class ExtendedCommand extends Command {

	protected ExtendedCommand(Duration duration) {
		super(duration);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Hello from extended command");
	}

	public final static void main(String[] args) {
		Command command = new ExtendedCommand(Duration.parse("pt1s"));
		System.out.println("Command must run ar " + command.timeToRun());
		command.run();
	}

}
