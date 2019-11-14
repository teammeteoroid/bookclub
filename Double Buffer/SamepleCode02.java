class Scene{
  private Framebuffer buffer;
  
  public void draw(){
    buffer.clear();

    buffer.draw(1, 1);
    buffer.draw(4, 1);
    buffer.draw(1, 3);
    buffer.draw(2, 4);
    buffer.draw(3, 4);
    buffer.draw(4, 3);
  }

  public Framebuffer getBuffer(){
    return buffer;
  }
}
