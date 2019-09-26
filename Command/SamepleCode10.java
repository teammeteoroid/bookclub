class MoveUnitCommand extends Command {
  private Unit unit;
  private int x;
  private int y;
  
  public MoveUnitCommand(Unit unit, int x, int y) {
    this.unit = unit;
    this.x = x;
    this.y = y;
  }

  public void execute() {
    unit.moveTo(x, y);
  }

}
