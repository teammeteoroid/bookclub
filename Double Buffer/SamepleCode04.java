class Scene {
  private Framebuffer[] buffers = new Framebuffer[2];
  private Framebuffer current;
  private Framebuffer next;
  
  public Scene() {
    current = buffers[0];
    next = buffers[1];
  }
  
  public void draw() {
    next.clear();
    next.draw(1, 1);
    // ...
    next.draw(4, 3);
    swap();
  }
  
  public Framebuffer getBuffer() {
    return current;
  }
  
  private void swap() {
    // Just switch the buffers.
    Framebuffer temp = current;
    current = next;
    next = temp;
  }
}
