package com.finalshell.ui.listener;

import com.finalshell.ui.panel.Wd2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Gp2 extends ComponentAdapter {
   public final Wd2 I;

   public Gp2(Wd2 var1) {
      this.I = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.I.t$void();
   }
}





