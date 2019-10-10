class Subject {
  void removeObserver(Observer observer) {
    if (head == observer) {
      head = observer.next;
      observer.next = NULL;
      return;
    }

    Observer current = head;
    while (current != NULL) {
      if (current.next == observer) {
        current.next = observer.next;
        observer.next = NULL;
        return;
      }

      current = current.next;
    }
  }
}
