package com;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IO extends MouseAdapter {
   @Override
   public void mousePressed(MouseEvent var1) {
      var1.getComponent().requestFocusInWindow();
   }
}





