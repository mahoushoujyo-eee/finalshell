package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Da4 extends ComponentAdapter {
   final com.finalshell.core.QH q;

   Da4(com.finalshell.core.QH var1) {
      this.q = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.q.h();
   }
}





