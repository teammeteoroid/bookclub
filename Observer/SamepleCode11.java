class Subject {
  void notify(Entity entity, Event event) {
    Observer observer = head;
    while (observer != NULL) {
      observer.onNotify(entity, event);
      observer = observer.next;
	}
  }
}
