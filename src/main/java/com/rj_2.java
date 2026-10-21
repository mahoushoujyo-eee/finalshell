package com;

import java.awt.Rectangle;

class Rj_2 implements Runnable {
   final Rectangle G;
   final com.Qm_2 V;

   Rj_2(com.Qm_2 var1, Rectangle var2) {
      this.V = var1;
      this.G = var2;
   }

   @Override
   public void run() {
      this.V.repaint(this.G);
   }
}





