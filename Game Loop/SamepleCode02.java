while (true) {
  Event event = waitForEvent();
  dispatchEvent(event);
}
