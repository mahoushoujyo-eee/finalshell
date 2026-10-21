package com.finalshell.ui.listener;

import com.finalshell.ui.panel.OY3;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ol2 extends ComponentAdapter {
   final OY3 M;

   Ol2(OY3 var1) {
      this.M = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.M.P();
   }
}





