package com.finalshell.ui.listener;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class O3 extends FocusAdapter {
   public final com.finalshell.core.M3 F;

   public O3(com.finalshell.core.M3 var1) {
      this.F = var1;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      com.finalshell.core.M3.v$JComboBox(this.F).repaint();
   }

   @Override
   public void focusLost(FocusEvent var1) {
      com.finalshell.core.M3.R(this.F).repaint();
   }
}





