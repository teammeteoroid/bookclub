class Heroine {
  void update() {
    if (state == STATE_DUCKING) {
      chargeTime++;
      if (chargeTime > MAX_CHARGE) {
        superBomb();
    }
  }
}
