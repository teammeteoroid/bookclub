package game;

public class Command5 {
	public class JumpCommand extends Command {
		public void execute(GameActor actor) {
			actor.jump();
		}
	}
}