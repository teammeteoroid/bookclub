class Subject {
  void addObserver(Observer observer) {
    observer.next = head;
    head = observer;
  }
}
