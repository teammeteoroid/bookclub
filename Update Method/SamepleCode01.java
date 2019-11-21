while (true) {
  // Patrol right.
  for (double x = 0; x < 100; x++) {
    skeleton.setX(x);
  }

  // Patrol left.
  for (double x = 100; x > 0; x--) {
    skeleton.setX(x);
  }
}
