package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kc4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Rg4 extends MouseAdapter {
   final Kc4 Y;

   Rg4(Kc4 var1) {
      this.Y = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.Y.requestFocusInWindow();
   }
}





