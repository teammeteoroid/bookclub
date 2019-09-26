package game;

public class Command9 {
	public class MoveUnitCommand extends Command {

		  private Unit unit_;
		  private int xBefore_;
		  private int yBefore_;
		  private int x_;
		  private int y_;
		  public MoveUnitCommand(Unit unit, int x, int y) {
			  this.unit_ = unit;
			  this.xBefore_ = 0;
			  this.yBefore_ = 0;
			  this.x_ = x;
			  this.y_ = y;
		  }

		  public void execute(){
			  xBefore_ = unit_.x();
			  yBefore_ = unit_.y();
			  unit_.moveTo(x_, y_);
		  }

		  public void undo() {
			  unit_.moveTo(xBefore_, yBefore_);
		  }
		}
	}
}
