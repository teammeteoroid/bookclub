Command handleInput() {
  Unit unit = getSelectedUnit();

  if (isPressed(BUTTON_UP)) {
    // Move the unit up one.
    int destY = unit.y - 1;
    return new MoveUnitCommand(unit, unit.x, destY);
  }

  if (isPressed(BUTTON_DOWN)) {
    // Move the unit down one.
    int destY = unit.y + 1;
    return new MoveUnitCommand(unit, unit.x, destY);
  }

  // Other moves...

  return null;
}
