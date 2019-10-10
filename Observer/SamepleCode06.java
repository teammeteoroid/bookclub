public class Physics {
  private Subject subject;
  
  public Physics addObserver(Subject subject) {
	  this.subject = subject;
	  return this;
  }
  
  public Physics entityFell() {
    // something...
	return this;
  }
  
  public void updateEntity(Entity entity) {
    // something...
  }
}
