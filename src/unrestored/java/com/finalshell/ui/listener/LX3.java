package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Kc4;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LX3 extends MouseAdapter {
   public final Kc4 l;

   public LX3(Kc4 var1) {
      this.l = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.l.requestFocusInWindow();
   }
}





