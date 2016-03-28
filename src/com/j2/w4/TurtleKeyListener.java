package com.j2.w4;

import java.awt.event.KeyAdater;
import java.awt.event.KeyEvent;
import ch.aplu.turtle.*;

    
class TurtleKeyListener extends Turtle{
  public TurtleKeyListener(){
    addKeyListener( new KeyAdapter (){
    public void KeyPressed(KeyEvent e){
    int keyCode = e.getKeyCode();
    switch(keyCode){
      case KeyEvent.VK_UP:
      setStatusText("forward 20");
      forward(20);
      break;
      case KeyEvent.VK_DOWN:
      setStatusText("back 20");
      back(20);
      break;
      case KeyEvent.VK_Q:
      setStausText("q pressed andexiting");
      break;
    }
  }
});
  }
}

public class TurtleKeyObserverMain{
  public static void maint(String[] args){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press amy Key!");
  }
}
    

