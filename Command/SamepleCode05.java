void handleInput() {
  if (isPressed(BUTTON_X)) buttonX.execute();
  else if (isPressed(BUTTON_Y)) buttonY.execute();
  else if (isPressed(BUTTON_A)) buttonA.execute();
  else if (isPressed(BUTTON_B)) buttonB.execute();
}
