package com.finalshell.ui.listener;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Ot4 implements FocusListener {
   final com.finalshell.core.QH u;

   Ot4(com.finalshell.core.QH var1) {
      this.u = var1;
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.finalshell.core.QH.P(this.u).repaint();
   }

   @Override
   public void focusGained(FocusEvent var1) {
      com.finalshell.core.QH.P(this.u).repaint();
   }
}





