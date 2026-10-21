package com.finalshell.ui.listener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class YD3 extends ComponentAdapter {
   final com.finalshell.core.Lk4 o;

   YD3(com.finalshell.core.Lk4 var1) {
      this.o = var1;
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      this.o.C$void();
   }
}





