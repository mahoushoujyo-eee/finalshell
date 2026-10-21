package com.finalshell.ui.listener;

import com.finalshell.ui.panel.K42;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

public class RL3 extends MouseAdapter {
   final K42 d;

   RL3(K42 var1) {
      this.d = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      if (SwingUtilities.isLeftMouseButton(var1)) {
         K42.L(this.d).doClick(0);
      }
   }
}





