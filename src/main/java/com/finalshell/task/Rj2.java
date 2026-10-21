package com.finalshell.task;

import com.finalshell.ui.panel.Qm2;
import java.awt.Rectangle;

public class Rj2 implements Runnable {
   final Rectangle G;
   final Qm2 V;

   Rj2(Qm2 var1, Rectangle var2) {
      this.V = var1;
      this.G = var2;
   }

   @Override
   public void run() {
      this.V.repaint(this.G);
   }
}





