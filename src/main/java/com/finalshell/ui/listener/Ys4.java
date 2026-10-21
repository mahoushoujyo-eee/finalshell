package com.finalshell.ui.listener;

import com.finalshell.core.Ie2;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Ys4 extends ComponentAdapter {
   public final Ie2 W;

   public Ys4(Ie2 var1) {
      this.W = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      this.W.M();
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
      this.W.M();
   }
}





