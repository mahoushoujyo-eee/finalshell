package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class RQ extends KeyAdapter {
   final com.k3_2 t;

   RQ(com.k3_2 var1) {
      this.t = var1;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      int[] var2 = com.k3_2.L();
      if (var2 != null && (GR.lZ.J(var1) || var2 != null && GR.rN.J(var1))) {
         this.t.q();
      }
   }
}





