package game;

public class Command2 {
	public class JumpCommand extends Command {
		public void execute()
		{
			jump();
		}
	}

	public class FireCommand extends Command {
	  public void execute() {
		  fireGun();
	  }
	}
}
