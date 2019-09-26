package game;

public class Command6 {
	Command command = inputHandler.handleInput();
	if (command != null) {
		command.execute(actor);
	}
}
