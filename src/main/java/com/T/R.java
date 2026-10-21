package com.t;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class R extends MouseAdapter {
   final com.t.X n;

   private R(com.t.X var1) {
      this.n = var1;
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      this.F(var1.getY());
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      this.F(var1.getY());
   }

   private void F(int var1) {
      com.t.X.B(this.n, Math.round(360.0F * ((float)(var1 - 5) / (float)(com.t.X.E(this.n).getHeight() - 4))), true);
   }

   R(com.t.X var1, d_3 var2) {
      this(var1);
   }
}





