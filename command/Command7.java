package game;

public class Command7 {
	public class MoveUnitCommand extends Command {
		private Unit unit_;
		private int x_;
		private int y_;
		public MoveUnitCommand(Unit unit, int x, int y) {
			this.unit_ = unit;
			this.x_ = x;
			this.y_ = y;
		}

		public void execute() {
			unit_.moveTo(x_, y_);
		}
	}