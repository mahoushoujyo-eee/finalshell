package com.finalshell.ui.listener;

import com.finalshell.core.Hl2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class X4 extends ComponentAdapter {
   final Hl2 g;

   X4(Hl2 var1) {
      this.g = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.g.h();
   }
}





