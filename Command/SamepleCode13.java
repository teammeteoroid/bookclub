class MoveUnitCommand extends Command {
  private Unit unit;
  private int x;
  private int y;
  private int xBefore;
  private int yBefore;
  
  public MoveUnitCommand(Unit unit, int x, int y) {
    this.unit = unit;
    this.x = x;
    this.y = y;
  }

  public void execute() {
    unit.moveTo(x, y);
  }
  
  public void undo() {
    unit.moveTo(xBefore, yBefore);
  }

}
