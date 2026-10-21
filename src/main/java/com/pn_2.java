package com;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class Pn_2 extends FocusAdapter {
   final com.k4_2 N;
   final com.kk_4 H;

   Pn_2(com.kk_4 var1, com.k4_2 var2) {
      this.H = var1;
      this.N = var2;
   }

   @Override
   public void focusGained(FocusEvent var1) {
      com.kk_4.L(this.H);
   }
}





