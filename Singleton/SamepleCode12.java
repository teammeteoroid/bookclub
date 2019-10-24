abstract class GameObject {
  private static Log log;
  
  protected Log getLog() {
    return log;
  }
}

public class Enemy extends GameObject {
  void doSomething(){
    getLog().write("I can log!");
  }
}
