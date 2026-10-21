package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CK3 extends ComponentAdapter {
   public final Ic2 n;

   public CK3(Ic2 var1) {
      this.n = var1;
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      Ic2.w(this.n);
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      Ic2.w(this.n);
   }
}





