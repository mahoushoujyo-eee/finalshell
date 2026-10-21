package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Da4 extends ComponentAdapter {
   public final com.finalshell.core.QH q;

   public Da4(com.finalshell.core.QH var1) {
      this.q = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.q.h();
   }
}





