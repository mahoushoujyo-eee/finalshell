package com;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class dM_3 extends KeyAdapter {
   final com.KR p;
   final com.kd_4 h;

   dM_3(com.kd_4 var1, com.KR var2) {
      this.h = var1;
      this.p = var2;
   }

   @Override
   public void keyReleased(KeyEvent var1) {
      String var2 = com.kE_3.v();
      if (var2 == null && GR.lD.J(var1)) {
         this.p.requestFocusInWindow();
      }
   }
}





