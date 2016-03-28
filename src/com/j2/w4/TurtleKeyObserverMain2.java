package com.j2.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


    
class TurtleKeyListener extends Turtle{
  public TurtleKeyListener(){
    addKeyListener( new KeyAdapter(){
    public void keyPressed(KeyEvent e) {
      int keyCode = e.getKeyCode();
      switch(keyCode){
        case KeyEvent.VK_E:
          setStatusText("forward 30");
          forward(30);
          break;
        case KeyEvent.VK_D:
          setStatusText("back 30");
          back(30);
          break;
        case KeyEvent.VK_S:
          setStatusText("turn left");
          left(90);
          break;
        case KeyEvent.VK_F :
          setStatusText("turn right");
          right(90);
          break;
        case KeyEvent.VK_Q:
          setStatusText("q pressed and exiting");
          break;
    }
  }
});
  }
}

public class TurtleKeyObserverMain2{
  public static void main(String[] args){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any Key!");
  }
}
    

