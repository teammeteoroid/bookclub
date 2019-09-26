package game;

public class Command8 {
	private Command handleInput() {
		Unit unit = getSelectedUnit();

		if (isPressed(BUTTON_UP)) {
			int destY = unit.y() - 1;
			return new MoveUnitCommand(unit, unit.x(), destY);
		}

		if (isPressed(BUTTON_DOWN)) {
			int destY = unit.y() + 1;
			return MoveUnitCommand(unit, unit.x(), destY);
		}
	}	
}