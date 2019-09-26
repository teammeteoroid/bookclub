package game;

public class Command4 {
	public class InputHandler {
		public void handleInput() {
			if (isPressed(BUTTON_X)) {
			  buttonX_.execute();
			}
			else if (isPressed(BUTTON_Y)) {
				buttonY_.execute();
			}
			else if (isPressed(BUTTON_A)) {
				buttonA_.execute();
			}
			else if (isPressed(BUTTON_B) {
				buttonB_.execute();
			}
		}
	}
}
